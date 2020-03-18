package entities.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import entities.diagram.providers.DefaultElementTypes;

/**
 * @generated
 */
public class DefaultPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEntities1Group());
	}

	/**
	 * Creates "entities" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntities1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Entities1Group_title);
		paletteContainer.setId("createEntities1Group"); //$NON-NLS-1$
		paletteContainer.add(createCapteur1CreationTool());
		paletteContainer.add(createDataBase2CreationTool());
		paletteContainer.add(createCloud3CreationTool());
		paletteContainer.add(createGateWay4CreationTool());
		paletteContainer.add(createEntryFunction5CreationTool());
		paletteContainer.add(createLink6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapteur1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Capteur1CreationTool_title,
				Messages.Capteur1CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.Capteur_2001));
		entry.setId("createCapteur1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.Capteur_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataBase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.DataBase2CreationTool_title,
				Messages.DataBase2CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.DataBase_2002));
		entry.setId("createDataBase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.DataBase_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloud3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Cloud3CreationTool_title,
				Messages.Cloud3CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.Cloud_2003));
		entry.setId("createCloud3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.Cloud_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGateWay4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.GateWay4CreationTool_title,
				Messages.GateWay4CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.GateWay_2004));
		entry.setId("createGateWay4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.GateWay_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryFunction5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EntryFunction5CreationTool_title,
				Messages.EntryFunction5CreationTool_desc,
				Collections
						.singletonList(DefaultElementTypes.EntryFunction_2005));
		entry.setId("createEntryFunction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.EntryFunction_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Link6CreationTool_title,
				Messages.Link6CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.Link_4001));
		entry.setId("createLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
