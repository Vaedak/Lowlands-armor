// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHellborn_Pirate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hellborn_pirate"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelHellborn_Pirate(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(56, 87).addBox(
				-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -8.0F, -12.0F, 0.0F, 9.0F, 28.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5333F, -7.0473F, -3.9889F, 0.0594F, -0.5464F, -0.4061F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(84, 0).addBox(-14.5F, -5.0F, 0.0F, 30.0F, 6.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.5667F, -4.7651F, 6.9047F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(56, 19).addBox(0.0F, -5.0F, -13.0F, 0.0F, 6.0F, 28.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-6.3556F, -6.6918F, -2.9223F, 0.1376F, -0.5335F, -0.558F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 53).addBox(0.0F, -5.0F, -12.0F, 0.0F, 6.0F, 28.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.4667F, -6.6918F, -3.6334F, 0.1376F, 0.5335F, 0.558F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -8.0F, -12.0F, 0.0F, 9.0F, 28.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6444F, -7.0473F, -3.9889F, 0.0594F, 0.5464F, 0.4061F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(84, 18).addBox(-11.5F, -2.0F, 0.0F, 23.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0333F, -10.4756F, -14.1815F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 0.0F, -12.0F, 23.0F, 0.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5333F, -5.1778F, -0.1778F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(88, 87).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(80, 104).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3556F, 5.0F, -3.1111F, 0.0871F, 0.5528F, 0.3872F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 107).addBox(-4.5F, -5.0F, 0.0F, 9.0F, 10.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0333F, 14.3556F, 3.3556F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(72, 104).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3556F, 5.0F, -3.1111F, 0.0871F, -0.5528F, -0.3872F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(88, 103)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r8 = RightArm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(18, 109).mirror()
						.addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8226F, 5.6982F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(104, 103).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F,
						new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-2.5333F, -1.0F, 0.1778F, 0.0F, 0.0F, -0.7854F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(56, 104)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r9 = LeftArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(104, 10).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8226F, 5.3427F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(24, 93)
				.addBox(-2.3556F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.43F)).texOffs(40, 93).mirror()
				.addBox(-2.3556F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(36, 109).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -1.5778F, 0.48F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(40, 93)
				.addBox(-1.6444F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(26, 109).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -1.5778F, 0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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