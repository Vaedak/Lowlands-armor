package net.mcreator.lowlandsclothing.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfurnace_master_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("lowlands_clothing", "modelfurnace_master_armor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelfurnace_master_armor(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(56, 0).addBox(4.0F, 1.0F, -1.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(56, 59)
						.addBox(-4.0F, 1.0F, -1.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 13).addBox(10.0F, -18.1778F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(9.0F, -16.1778F, 5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-14.2889F, -14.8889F, 5.1778F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 10)
						.addBox(-13.2889F, -16.8889F, 6.1778F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 50).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -17.4667F, 8.1778F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 50).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.6951F, -17.4667F, 8.5333F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 50).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.3556F, -18.7778F, 8.3556F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 50).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.6444F, -18.7778F, 8.3556F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 63).addBox(-1.0F, -22.0F, -1.0F, 2.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 9.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 29).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-5.6284F, -20.0162F, 9.0F, 0.0F, 0.0F, -1.7017F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 29).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.6284F, -20.0162F, 9.0F, 0.0F, 0.0F, 1.7017F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 63).addBox(-1.0F, -22.0F, -1.0F, 2.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(24, 19).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 5.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(64, 16).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-3.0F, 11.5F, -3.5F, 0.0F, 0.3054F, -0.1309F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 63).addBox(-3.9556F, 3.4667F, -2.4667F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(0, 50)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(37, 53).addBox(-3.4222F, -3.0F, -3.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 37).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(16, 53)
				.addBox(0.4222F, -3.0F, -3.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.4F)).texOffs(40, 63).addBox(0.9556F, 3.4667F, -2.4667F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(40, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.43F)).texOffs(56, 44).addBox(-3.0F, 0.0F, -2.4667F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.41F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.41F)).texOffs(56, 29).addBox(-1.0F, 0.0F, -2.4667F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.41F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
