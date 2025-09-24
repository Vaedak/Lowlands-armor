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

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBret_armor_corsair_v2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("lowlands_clothing", "model_bret_armor_corsair_v_2"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelBret_armor_corsair_v2(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 41).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 58).addBox(-10.5F, -1.0F, 0.0F, 21.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0333F, -4.7651F, 6.9047F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -1.0F, -10.0F, 0.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -6.6918F, -3.2778F, 0.1376F, -0.5335F, -0.558F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -1.0F, -10.0F, 0.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -6.6918F, -3.2778F, 0.1376F, 0.5335F, 0.558F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 0.0F, -12.0F, 23.0F, 0.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.1778F, -0.1778F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(44, 60).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(0, 67).addBox(-4.0F, 0.3556F, -2.0F, 8.0F, 10.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(44, 19).addBox(-6.0F, -8.0F, -3.0F, 12.0F, 16.0F, 6.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-3.0667F, 8.1778F, 0.3556F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 76).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(76, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 76).addBox(-1.0F, -4.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4667F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(24, 67).addBox(-2.3556F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.43F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 76).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -1.5778F, 0.48F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(68, 60).addBox(-1.6444F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.41F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 55).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -1.5778F, 0.48F, 0.0F, 0.0F));
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
