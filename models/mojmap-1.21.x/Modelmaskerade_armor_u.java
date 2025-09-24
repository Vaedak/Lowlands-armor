// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmaskerade_armor_u<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "maskerade_armor_u"), "main");
	private final ModelPart head;
	private final ModelPart head4;
	private final ModelPart head3;
	private final ModelPart nose3;
	private final ModelPart nose4;
	private final ModelPart body;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart arms_left;
	private final ModelPart arm_right;

	public Modelmaskerade_armor_u(ModelPart root) {
		this.head = root.getChild("head");
		this.head4 = this.head.getChild("head4");
		this.head3 = this.head.getChild("head3");
		this.nose3 = this.head.getChild("nose3");
		this.nose4 = this.head.getChild("nose4");
		this.body = root.getChild("body");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.arms_left = root.getChild("arms_left");
		this.arm_right = root.getChild("arm_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(62, 24)
						.addBox(-1.0F, -3.0F, -5.8222F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(28, 0)
						.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head4 = head
				.addOrReplaceChild("head4",
						CubeListBuilder.create().texOffs(22, 52).addBox(0.1624F, -8.0F, -0.1854F, 5.0F, 8.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition head3 = head
				.addOrReplaceChild("head3",
						CubeListBuilder.create().texOffs(0, 48).addBox(-5.1624F, -8.0F, -0.1854F, 5.0F, 8.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition nose3 = head
				.addOrReplaceChild("nose3",
						CubeListBuilder.create().texOffs(32, 66).addBox(-5.1624F, -1.0F, -2.1854F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, -2.0F, 0.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition nose4 = head
				.addOrReplaceChild("nose4",
						CubeListBuilder.create().texOffs(70, 24).addBox(3.1624F, -1.0F, -2.1854F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-8.0F, -2.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(28, 34)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.6F)).texOffs(0, 24)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.99F)).texOffs(60, 8)
						.addBox(-1.0F, 10.0F, 8.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 16)
						.addBox(-7.0F, -1.0F, 10.8889F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(44, 52).addBox(-6.0F, -2.0F, -1.0F, 12.0F, 3.0F, 3.0F,
						new CubeDeformation(0.98F)),
				PartPose.offsetAndRotation(0.0F, -1.9778F, 7.4222F, 0.6545F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(28, 18).addBox(-6.0F, -26.0F, -2.0F, 12.0F, 11.0F, 5.0F,
						new CubeDeformation(0.99F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 3.5778F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(56, 34).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.52F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(44, 58).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition arms_left = partdefinition.addOrReplaceChild("arms_left",
				CubeListBuilder.create().texOffs(60, 58)
						.addBox(-0.5F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(16, 66)
						.addBox(3.5F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 2.0F, 0.0F));

		PartDefinition arm_right = partdefinition.addOrReplaceChild("arm_right",
				CubeListBuilder.create().texOffs(0, 62)
						.addBox(-3.5F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(24, 66)
						.addBox(-5.5F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.arm_right.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.arms_left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}