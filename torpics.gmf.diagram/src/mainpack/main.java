package mainpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.json.simple.parser.ParseException;

import entities.EntitiesFactory;
import entities.EntryFunction;
import entities.Network;
import entities.Objects;
import entities.diagram.navigator.DefaultDomainNavigatorItem;
import entities.impl.CloudImpl;
import entities.impl.DataBaseImpl;
import entities.impl.EntryFunctionImpl;
import entities.impl.LinkImpl;
import entities.impl.NetworkImpl;



public class main extends AbstractHandler {
	 DefaultDomainNavigatorItem graf;
	
	  @Override
	    public void addHandlerListener(IHandlerListener handlerListener) {
	      
	    }
	 
	    @Override
	    public void dispose() {
	      
	    }
	 
	    Shell shell;
	 
	    @Override
	    public Object execute(ExecutionEvent event) throws ExecutionException {
	        shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
	        ISelection selection = HandlerUtil.getCurrentSelection(event);
	        Object first = ((TreeSelection) selection).getFirstElement();
	        graf = (DefaultDomainNavigatorItem) first;
     
				try {
					createStates();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
        
        return null;
    }


	    public void createStates() throws ParseException, Exception, Exception {
	   	
    	
    	//Declaration des variables
		 int i=0,j=0, cptBDD=0, cptCloud=0;    	
		 String db="",req1="", req2="";
		 PrintWriter writer_main,writer_sql,writer_rest;
		 String nomGraphe; 
		 NetworkImpl graphe;
		 String input_graphe = "default.entities";
		 Objects type;
	 
		Network _graphe = EntitiesFactory.eINSTANCE.createNetwork();			
		final String apiSamplePath = System.getProperty("user.dir").concat("//runtime-EclipseApplication//src//");
		
		writer_main = new PrintWriter(apiSamplePath+"Main.java", "UTF-8");
		writer_sql = new PrintWriter(apiSamplePath+"mysql.java", "UTF-8");
		writer_rest = new PrintWriter(apiSamplePath+"RESTCall.java", "UTF-8");
	
	
		graphe = (NetworkImpl)graf.getEObject();
		URI urigraphe = URI.createURI("file:/" + apiSamplePath + input_graphe);		
		ResourceSet resourceSet_network = new ResourceSetImpl();
		Resource resource_network = resourceSet_network.getResource(urigraphe, true);
		_graphe = (Network) resource_network.getContents().get(0);

		EList<Objects> listeNoeuds = graphe.getObjectsList();
		Iterator<Objects> in = listeNoeuds.iterator();
  

		writer_main.write("public class Main { \n\n\n");
	    writer_main.write("public static void main(String[] args) throws Exception{ \n\n\n");

	    while (in.hasNext()  ){
	
	    	type = (Objects)in.next();
	    	if (type instanceof DataBaseImpl) {
			     i=1;
			     cptBDD++;
			     String username= ((DataBaseImpl) type).getUserName();
			     String password=((DataBaseImpl) type).getPwd();
			     String urlbdd=((DataBaseImpl) type).getUrl();
			     String  typebdd=((DataBaseImpl) type).getType().toString();
			     String nombdd = ((DataBaseImpl) type).getName();
			     int portbdd=((DataBaseImpl) type).getPort();
			     
			    
			    writer_main.write("mysql db"+db.concat(Integer.toString(cptBDD))+" = null;\n"); 
			    writer_main.write("db"+db.concat(Integer.toString(cptBDD))+" = new mysql(\""+urlbdd+"\","+portbdd+",\""+username+"\",\""+password+"\",\""+typebdd+"\",\""+nombdd+"\");\n\n");
			    if (req1 != ""){
			    	writer_main.write(req1); 
			    	req1="";      
			    				}
	    	}
      
           

          if (type instanceof CloudImpl) {
        	j=1;
			String api=	((CloudImpl) type).getAPIKey();
			int portcloud=	((CloudImpl) type).getPort();
			int idchannel = ((CloudImpl) type).getChannelID();
			String method=	 ((CloudImpl) type).getMethod().toString();
			String urlcloud =((CloudImpl) type).getUrl();
		
			writer_main.write("RESTCall rc = new RESTCall(\""+urlcloud+"\",\""+  api+"\","+portcloud+","+ idchannel+");\n\n");
				
		}
          
           if (type instanceof EntryFunction) {
        	   String	 metric=  ((EntryFunction) type).getMetric().toString();
        	   String typefun = ((EntryFunction) type).getType().toString();
        	   int period= ((EntryFunction) type).getPeriod();
        	   int seuil = ((EntryFunction) type).getThreshold();
        	   
        	   if (i ==1){
        		   i=0;
          		   writer_main.write("int res= db"+db.concat(Integer.toString(cptBDD))+".excute(\""+metric+"\",\""+typefun+"\","+period+","+seuil+");\n\n");
              	   req1="db"+db.concat(Integer.toString(cptBDD+1))+".save( \""+typefun+"\", res);";
             	}
        	   
              	if (j==1) {
              		j=0;
              		writer_main.write("System.out.println(rc.readDataOverRest(\""+metric+"\",\""+typefun+"\","+period+","+seuil+"));\n\n");
   				}	
       }
  }
  	

	writer_main.write("} \n } \n");
	
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1 = new StringBuilder();

    try (BufferedReader br = Files.newBufferedReader(Paths.get("C://Users//islam//Desktop//scirus//torpics.gmf.diagram//src//mainpack//mysql.java"))) {
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }

    } catch (IOException e) {
        System.err.format("IOException: %s%n", e);
    }

	writer_sql.println(sb);

    try (BufferedReader br1 = Files.newBufferedReader(Paths.get("C://Users//islam//Desktop//scirus//torpics.gmf.diagram//src//mainpack//RESTCall.java"))) {

        String line;
        br1.readLine();
        while ((line = br1.readLine()) != null) {
            sb1.append(line).append("\n");
        }

    } catch (IOException e) {
        System.err.format("IOException: %s%n", e);
    }

	writer_rest.println(sb1);
	

	writer_main.close();
	writer_sql.close();
	writer_rest.close();
		
	try {
		resource_network.save(null);
	} catch (IOException e) {
		e.printStackTrace();
	}
 
    }

}
    
    
   
       
 
    
 
 

