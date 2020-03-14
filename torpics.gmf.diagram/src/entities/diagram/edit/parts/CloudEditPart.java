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

import entities.diagram.edit.policies.CloudItemSemanticEditPolicy;
import entities.diagram.part.DefaultVisualIDRegistry;

/**
 * @generated
 */
public class CloudEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public CloudEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CloudItemSemanticEditPolicy());
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
		return primaryShape = new CloudFigure();
	}

	/**
	 * @generated
	 */
	public CloudFigure getPrimaryShape() {
		return (CloudFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CloudNameEditPart) {
			((CloudNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureCloudNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CloudNameEditPart) {
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
				.getType(CloudNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CloudFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudUrlFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudUserNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudPwdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudPortFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudMethodFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudAPIKeyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudChannelIDFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudProtocolFigure;

		/**
		 * @generated
		 */
		public CloudFigure() {

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

			fFigureCloudIdFigure = new WrappingLabel();

			fFigureCloudIdFigure.setText("<...>");

			this.add(fFigureCloudIdFigure);

			fFigureCloudNameFigure = new WrappingLabel();

			fFigureCloudNameFigure.setText("<...>");

			this.add(fFigureCloudNameFigure);

			fFigureCloudUrlFigure = new WrappingLabel();

			fFigureCloudUrlFigure.setText("<...>");

			this.add(fFigureCloudUrlFigure);

			fFigureCloudUserNameFigure = new WrappingLabel();

			fFigureCloudUserNameFigure.setText("<...>");

			this.add(fFigureCloudUserNameFigure);

			fFigureCloudPwdFigure = new WrappingLabel();

			fFigureCloudPwdFigure.setText("<...>");

			this.add(fFigureCloudPwdFigure);

			fFigureCloudPortFigure = new WrappingLabel();

			fFigureCloudPortFigure.setText("<...>");

			this.add(fFigureCloudPortFigure);

			fFigureCloudTypeFigure = new WrappingLabel();

			fFigureCloudTypeFigure.setText("<...>");

			this.add(fFigureCloudTypeFigure);

			fFigureCloudMethodFigure = new WrappingLabel();

			fFigureCloudMethodFigure.setText("<...>");

			this.add(fFigureCloudMethodFigure);

			fFigureCloudAPIKeyFigure = new WrappingLabel();

			fFigureCloudAPIKeyFigure.setText("<...>");

			this.add(fFigureCloudAPIKeyFigure);

			fFigureCloudChannelIDFigure = new WrappingLabel();

			fFigureCloudChannelIDFigure.setText("<...>");

			this.add(fFigureCloudChannelIDFigure);

			fFigureCloudProtocolFigure = new WrappingLabel();

			fFigureCloudProtocolFigure.setText("<...>");

			this.add(fFigureCloudProtocolFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudIdFigure() {
			return fFigureCloudIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudNameFigure() {
			return fFigureCloudNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudUrlFigure() {
			return fFigureCloudUrlFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudUserNameFigure() {
			return fFigureCloudUserNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudPwdFigure() {
			return fFigureCloudPwdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudPortFigure() {
			return fFigureCloudPortFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudTypeFigure() {
			return fFigureCloudTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudMethodFigure() {
			return fFigureCloudMethodFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudAPIKeyFigure() {
			return fFigureCloudAPIKeyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudChannelIDFigure() {
			return fFigureCloudChannelIDFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudProtocolFigure() {
			return fFigureCloudProtocolFigure;
		}

	}

}
