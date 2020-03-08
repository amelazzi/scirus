package entities.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createLink3CreationTool());
		paletteContainer.add(createCloud4CreationTool());
		paletteContainer.add(createDevice5CreationTool());
		paletteContainer.add(createStorageDevice6CreationTool());
		paletteContainer.add(createGateWay7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapteur1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Capteur1CreationTool_title,
				Messages.Capteur1CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.DataBase_2001));
		entry.setId("createCapteur1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.DataBase_2001));
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
				Collections.singletonList(DefaultElementTypes.Capteur_2002));
		entry.setId("createDataBase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.Capteur_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Link3CreationTool_title,
				Messages.Link3CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.GateWay_2003));
		entry.setId("createLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.GateWay_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloud4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Cloud4CreationTool_title,
				Messages.Cloud4CreationTool_desc,
				Collections.singletonList(DefaultElementTypes.Cloud_2004));
		entry.setId("createCloud4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DefaultElementTypes
				.getImageDescriptor(DefaultElementTypes.Cloud_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Device5CreationTool_title,
				Messages.Device5CreationTool_desc, null, null) {
		};
		entry.setId("createDevice5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorageDevice6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.StorageDevice6CreationTool_title,
				Messages.StorageDevice6CreationTool_desc, null, null) {
		};
		entry.setId("createStorageDevice6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGateWay7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.GateWay7CreationTool_title,
				Messages.GateWay7CreationTool_desc, null, null) {
		};
		entry.setId("createGateWay7CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
