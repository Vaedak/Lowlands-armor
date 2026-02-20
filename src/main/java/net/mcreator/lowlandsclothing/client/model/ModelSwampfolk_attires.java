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
public class ModelSwampfolk_attires<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("lowlands_clothing", "model_swampfolk_attires"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelSwampfolk_attires(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 0.0F, -8.0F, 14.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5778F, -6.9111F, 1.309F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 17).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.65F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 17).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(0, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(56, 31).addBox(-3.5F, -1.5F, 1.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.8556F, 2.2889F, 1.1509F, 0.147F, -0.3655F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(32, 51).addBox(-3.5F, -1.5F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.5F, 10.5F, 4.0F, 0.3655F, 0.147F, -0.3655F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(56, 22).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(5.3889F, 12.0F, -0.0333F, -0.0692F, 0.2527F, -0.3579F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(16, 51).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(56, 17).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4667F, 3.7111F, 2.4667F, -0.9747F, -0.6793F, 0.2667F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(50, 51).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4667F, 3.7111F, 2.4667F, -0.9747F, 0.6793F, -0.2667F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(40, 35).addBox(-2.3556F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.47F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 51).addBox(-1.6444F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.46F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 80, 80);
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
