package entities.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import entities.diagram.edit.policies.DataBaseItemSemanticEditPolicy;
import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class DataBaseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DataBaseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DataBaseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DataBaseFigure();
	}

	/**
	 * @generated
	 */
	public DataBaseFigure getPrimaryShape() {
		return (DataBaseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataBaseNameEditPart) {
			((DataBaseNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDataBaseNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataBaseNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DefaultVisualIDRegistry
				.getType(DataBaseNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class DataBaseFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseUrlFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseUserNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBasePwdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBasePortFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataBaseProtocolFigure;

		/**
		 * @generated
		 */
		public DataBaseFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDataBaseIdFigure = new WrappingLabel();

			fFigureDataBaseIdFigure.setText("<...>");

			this.add(fFigureDataBaseIdFigure);

			fFigureDataBaseNameFigure = new WrappingLabel();

			fFigureDataBaseNameFigure.setText("<...>");

			this.add(fFigureDataBaseNameFigure);

			fFigureDataBaseUrlFigure = new WrappingLabel();

			fFigureDataBaseUrlFigure.setText("<...>");

			this.add(fFigureDataBaseUrlFigure);

			fFigureDataBaseUserNameFigure = new WrappingLabel();

			fFigureDataBaseUserNameFigure.setText("<...>");

			this.add(fFigureDataBaseUserNameFigure);

			fFigureDataBasePwdFigure = new WrappingLabel();

			fFigureDataBasePwdFigure.setText("<...>");

			this.add(fFigureDataBasePwdFigure);

			fFigureDataBasePortFigure = new WrappingLabel();

			fFigureDataBasePortFigure.setText("<...>");

			this.add(fFigureDataBasePortFigure);

			fFigureDataBaseTypeFigure = new WrappingLabel();

			fFigureDataBaseTypeFigure.setText("<...>");

			this.add(fFigureDataBaseTypeFigure);

			fFigureDataBaseProtocolFigure = new WrappingLabel();

			fFigureDataBaseProtocolFigure.setText("<...>");

			this.add(fFigureDataBaseProtocolFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseIdFigure() {
			return fFigureDataBaseIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseNameFigure() {
			return fFigureDataBaseNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseUrlFigure() {
			return fFigureDataBaseUrlFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseUserNameFigure() {
			return fFigureDataBaseUserNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBasePwdFigure() {
			return fFigureDataBasePwdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBasePortFigure() {
			return fFigureDataBasePortFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseTypeFigure() {
			return fFigureDataBaseTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataBaseProtocolFigure() {
			return fFigureDataBaseProtocolFigure;
		}

	}

}
