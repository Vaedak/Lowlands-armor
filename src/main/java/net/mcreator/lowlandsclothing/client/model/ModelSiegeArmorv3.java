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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSiegeArmorv3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("lowlands_clothing", "model_siege_armorv_3"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelSiegeArmorv3(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.1778F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -6.5F, -4.0F, 0.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8222F, -6.6778F, 0.0F, 0.0F, -0.1309F, 0.2618F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(58, 24).addBox(-4.5F, -4.5F, -1.0F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.0F, -2.2111F, -3.3556F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(24, 30).addBox(0.0F, -6.5F, -4.0F, 0.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8222F, -6.6778F, 0.0F, 0.0F, 0.1309F, -0.2618F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.65F)).texOffs(24, 16).addBox(-4.0F, 0.0F, -2.4667F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.66F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = Body.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(50, 10).addBox(-2.0F, -6.0F, -3.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.53F)),
				PartPose.offsetAndRotation(4.5F, 15.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition RightLeg_r1 = Body.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(40, 48).addBox(-2.0F, -6.0F, -3.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.53F)),
				PartPose.offsetAndRotation(-4.5F, 15.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, -4.5F, -2.5F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.5F, 4.0333F, 0.0F, -0.48F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -4.5F, -2.5F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.5F, 4.0333F, 0.0F, 0.48F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 53).addBox(-3.7F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(16, 51).addBox(-7.75F, -6.0F, 0.0167F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 62).addBox(-0.75F, -2.0F, -2.5167F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.55F)),
				PartPose.offsetAndRotation(-4.0749F, -1.9652F, 0.05F, 0.0F, 0.0F, 0.2182F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(70, 15).addBox(-0.5F, -3.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.55F)),
				PartPose.offsetAndRotation(-3.9889F, 8.4F, 0.0333F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(60, 51).addBox(-0.3F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(52, 67).addBox(-4.25F, -2.0F, -2.5167F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.55F)).texOffs(32, 0).addBox(-4.25F, -6.0F, 0.0167F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0749F, -1.9652F, 0.05F, 0.0F, 0.0F, -0.2182F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(72, 67).addBox(-2.5F, -3.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.55F)),
				PartPose.offsetAndRotation(3.9889F, 8.4F, 0.0333F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 61).addBox(-2.5333F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.53F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(60, 35).addBox(-1.4667F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.53F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
