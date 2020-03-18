package mainpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;


 


























import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.archive.Handler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.Handle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.json.simple.parser.ParseException;

import entities.BddType;
import entities.Capteur;
import entities.CapteurType;
import entities.Device;
import entities.EntryFunction;
import entities.Objects;
import entities.diagram.navigator.DefaultDomainNavigatorItem;
import entities.impl.CapteurImpl;
import entities.impl.CloudImpl;
import entities.impl.DataBaseImpl;
import entities.impl.LinkImpl;
import entities.impl.NetworkImpl;
@SuppressWarnings("unchecked")
public class main implements IHandler {
 
	public main() {
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void addHandlerListener(IHandlerListener handlerListener) {
        // TODO Auto-generated method stub
   
    }
 
    @Override
    public void dispose() {
        // TODO Auto-generated method stub
 
    }
 
    Shell shell;
 
   // @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	
        shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        Object first = ((TreeSelection) selection).getFirstElement();
        NetworkImpl graphe;
        String nomGraphe;
        
        
        
        try {
            DefaultDomainNavigatorItem graf = (DefaultDomainNavigatorItem) first;
            nomGraphe= (graf.getParent().toString()).substring(2);
            graphe = (NetworkImpl)graf.getEObject();
        } catch (Exception e) {
            MessageDialog.openError(shell, "View Model",
            "In view \"Project Explorer\" select: \"*.graphe/Graphe\"");
            return null;
        }
        try {
        	System.out.println("\n\n\n---------------------------------------\n");
			vueModel(nomGraphe, graphe);
			System.out.println("\n\n---------------------------------------\n");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        return null;
    }
 
    private void vueModel(String nomGraphe, NetworkImpl graphe) throws ParseException{
    	int cpt=0;
         String  message = "Liste des noeuds\n";
        EList<Objects> listeNoeuds = graphe.getObjectsList();
        
       
        Objects type;
     
        mysql db = null; int i=0,j=0;
        RESTCall rc = null;
        
       Iterator<Objects> in = listeNoeuds.iterator();
       

      
       while (in.hasNext()  ){
    	 
    	   type = (Objects)in.next();
           if (type instanceof DataBaseImpl) {
            	i=1;
            	String username= ((DataBaseImpl) type).getUserName();
            	String password=((DataBaseImpl) type).getPwd();
            	String url=((DataBaseImpl) type).getUrl();
            	int port=((DataBaseImpl) type).getPort();
            	String typebdd=((DataBaseImpl) type).getType().toString();
            	
            	db = new mysql(url,port,username,password,typebdd);
            	
            	
        	}
         
            
            if (type instanceof CloudImpl) {
			j=1;
			
				String api=	((CloudImpl) type).getAPIKey();
				int port=	((CloudImpl) type).getPort();
				int idchannel = ((CloudImpl) type).getChannelID();
				String method=	 ((CloudImpl) type).getMethod().toString();
				String url =((CloudImpl) type).getUrl();
			
				rc = new RESTCall( url,  api, port, idchannel);
				
				
			}
                if (type instanceof EntryFunction) {
	            	String metric=  ((EntryFunction) type).getMetric().toString();
	            	String typefun = ((EntryFunction) type).getType().toString();
	            	int period= ((EntryFunction) type).getPeriod();
	            	int seuil = ((EntryFunction) type).getThreshold();
            
	            	
	            		
	            		if (i ==1){
	                		
	                		db.excute(metric,typefun,period,seuil);
	                		i=0;
	                	}
	                	if (j==1) {
	                		
	    					System.out.println(rc.readDataOverRest(metric,typefun,period,seuil));
	    					j=0;
	    				}
						
					
            	
            	
            	
            }
            
            if (type instanceof LinkImpl) {
            	
            	
            	
			}
            
            
            	}

        MessageDialog.openInformation(shell, "View Model", message);
        }

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}
	

	}
       
 
    
 
 

