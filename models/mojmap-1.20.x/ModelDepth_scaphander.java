// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDepth_scaphander<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "depth_scaphander"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelDepth_scaphander(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)).texOffs(0, 87)
						.addBox(-5.0F, -2.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-5.0F, -7.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 80).mirror()
						.addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 80).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 19).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(64, 21).mirror()
						.addBox(0.0F, -1.5F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.6F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 10.9667F, -3.5F, 0.3054F, -0.3054F, 0.1309F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(64, 11).mirror()
						.addBox(0.0F, -1.5F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.6F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 12.0333F, -2.2556F, -0.0547F, -0.3006F, 0.3137F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(57, 60).addBox(-1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3556F, 9.0F, -0.3556F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 59).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0771F, 2.0F, 3.0981F, -0.2182F, 0.5236F, 0.0F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(84, 92).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.6189F, 8.768F, -0.9429F, 1.0782F, -0.8816F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(47, 93).addBox(1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5333F, 8.8889F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(28, 19).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 14.0F, 4.0F,
						new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(2.0F, 6.0F, 5.0F, -0.5299F, -0.7119F, 0.3655F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(64, 21).addBox(-2.0F, -1.5F, -0.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-4.0F, 11.5F, -2.2556F, 0.0F, 0.3054F, -0.1309F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(64, 16).addBox(-2.0F, -1.5F, -0.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-1.0F, 10.5F, -3.5F, 0.1309F, 0.3054F, -0.1309F));

		PartDefinition cube_r5 = Body
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(56, 0).addBox(1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 3.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 63)
						.addBox(-3.9556F, 3.4667F, -2.4667F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(0, 50)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(37, 53).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 4.0F, 6.0F,
						new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-2.2778F, -1.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(24, 37)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(40, 63)
						.addBox(0.9556F, 3.4667F, -2.4667F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(16, 53).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 4.0F, 6.0F,
						new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(2.2778F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(40, 37)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.43F)).texOffs(56, 44)
						.addBox(-3.0F, 1.0F, -2.4667F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.41F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 13)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.41F)).texOffs(56, 29)
						.addBox(-1.0F, 1.0F, -2.4667F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.41F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}