package com.emoniph.witchery.brewing;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelCauldron extends ModelBase {

   ModelRenderer base;
   ModelRenderer bottomF;
   ModelRenderer bottomB;
   ModelRenderer bottomL;
   ModelRenderer bottomR;
   ModelRenderer sideF;
   ModelRenderer sideB;
   ModelRenderer sideL;
   ModelRenderer sideR;
   ModelRenderer neckF;
   ModelRenderer neckB;
   ModelRenderer neckL;
   ModelRenderer neckR;
   ModelRenderer lipF;
   ModelRenderer lipB;
   ModelRenderer lipL;
   ModelRenderer lipR;
   ModelRenderer legFL;
   ModelRenderer legFR;
   ModelRenderer legBL;
   ModelRenderer legBR;


   public ModelCauldron() {
      super.textureWidth = 64;
      super.textureHeight = 64;
      this.base = new ModelRenderer(this, 0, 53);
      this.base.addBox(-5.0F, 5.0F, -5.0F, 10, 1, 10);
      this.base.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.base.setTextureSize(64, 64);
      this.base.mirror = true;
      this.setRotation(this.base, 0.0F, 0.0F, 0.0F);
      this.bottomF = new ModelRenderer(this, 0, 50);
      this.bottomF.addBox(-5.0F, 4.0F, -6.0F, 10, 1, 1);
      this.bottomF.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.bottomF.setTextureSize(64, 64);
      this.bottomF.mirror = true;
      this.setRotation(this.bottomF, 0.0F, 0.0F, 0.0F);
      this.bottomB = new ModelRenderer(this, 0, 50);
      this.bottomB.addBox(-5.0F, 4.0F, 5.0F, 10, 1, 1);
      this.bottomB.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.bottomB.setTextureSize(64, 64);
      this.bottomB.mirror = true;
      this.setRotation(this.bottomB, 0.0F, 0.0F, 0.0F);
      this.bottomL = new ModelRenderer(this, 0, 36);
      this.bottomL.addBox(5.0F, 4.0F, -6.0F, 1, 1, 12);
      this.bottomL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.bottomL.setTextureSize(64, 64);
      this.bottomL.mirror = true;
      this.setRotation(this.bottomL, 0.0F, 0.0F, 0.0F);
      this.bottomR = new ModelRenderer(this, 0, 36);
      this.bottomR.addBox(-6.0F, 4.0F, -6.0F, 1, 1, 12);
      this.bottomR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.bottomR.setTextureSize(64, 64);
      this.bottomR.mirror = true;
      this.setRotation(this.bottomR, 0.0F, 0.0F, 0.0F);
      this.sideF = new ModelRenderer(this, 27, 45);
      this.sideF.addBox(-6.0F, -2.0F, -7.0F, 12, 6, 1);
      this.sideF.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.sideF.setTextureSize(64, 64);
      this.sideF.mirror = true;
      this.setRotation(this.sideF, 0.0F, 0.0F, 0.0F);
      this.sideB = new ModelRenderer(this, 27, 45);
      this.sideB.addBox(-6.0F, -2.0F, 6.0F, 12, 6, 1);
      this.sideB.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.sideB.setTextureSize(64, 64);
      this.sideB.mirror = true;
      this.setRotation(this.sideB, 0.0F, 0.0F, 0.0F);
      this.sideL = new ModelRenderer(this, 27, 24);
      this.sideL.addBox(6.0F, -2.0F, -7.0F, 1, 6, 14);
      this.sideL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.sideL.setTextureSize(64, 64);
      this.sideL.mirror = true;
      this.setRotation(this.sideL, 0.0F, 0.0F, 0.0F);
      this.sideR = new ModelRenderer(this, 27, 24);
      this.sideR.addBox(-7.0F, -2.0F, -7.0F, 1, 6, 14);
      this.sideR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.sideR.setTextureSize(64, 64);
      this.sideR.mirror = true;
      this.setRotation(this.sideR, 0.0F, 0.0F, 0.0F);
      this.neckF = new ModelRenderer(this, 0, 32);
      this.neckF.addBox(-5.0F, -4.0F, -6.0F, 10, 2, 1);
      this.neckF.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.neckF.setTextureSize(64, 64);
      this.neckF.mirror = true;
      this.setRotation(this.neckF, 0.0F, 0.0F, 0.0F);
      this.neckB = new ModelRenderer(this, 0, 32);
      this.neckB.addBox(-5.0F, -4.0F, 5.0F, 10, 2, 1);
      this.neckB.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.neckB.setTextureSize(64, 64);
      this.neckB.mirror = true;
      this.setRotation(this.neckB, 0.0F, 0.0F, 0.0F);
      this.neckL = new ModelRenderer(this, 0, 17);
      this.neckL.addBox(5.0F, -4.0F, -6.0F, 1, 2, 12);
      this.neckL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.neckL.setTextureSize(64, 64);
      this.neckL.mirror = true;
      this.setRotation(this.neckL, 0.0F, 0.0F, 0.0F);
      this.neckR = new ModelRenderer(this, 0, 17);
      this.neckR.addBox(-6.0F, -4.0F, -6.0F, 1, 2, 12);
      this.neckR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.neckR.setTextureSize(64, 64);
      this.neckR.mirror = true;
      this.setRotation(this.neckR, 0.0F, 0.0F, 0.0F);
      this.lipF = new ModelRenderer(this, 27, 21);
      this.lipF.addBox(-6.0F, -5.0F, -7.0F, 12, 1, 1);
      this.lipF.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.lipF.setTextureSize(64, 64);
      this.lipF.mirror = true;
      this.setRotation(this.lipF, 0.0F, 0.0F, 0.0F);
      this.lipB = new ModelRenderer(this, 27, 21);
      this.lipB.addBox(-6.0F, -5.0F, 6.0F, 12, 1, 1);
      this.lipB.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.lipB.setTextureSize(64, 64);
      this.lipB.mirror = true;
      this.setRotation(this.lipB, 0.0F, 0.0F, 0.0F);
      this.lipL = new ModelRenderer(this, 27, 5);
      this.lipL.addBox(6.0F, -5.0F, -7.0F, 1, 1, 14);
      this.lipL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.lipL.setTextureSize(64, 64);
      this.lipL.mirror = true;
      this.setRotation(this.lipL, 0.0F, 0.0F, 0.0F);
      this.lipR = new ModelRenderer(this, 27, 5);
      this.lipR.addBox(-7.0F, -5.0F, -7.0F, 1, 1, 14);
      this.lipR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.lipR.setTextureSize(64, 64);
      this.lipR.mirror = true;
      this.setRotation(this.lipR, 0.0F, 0.0F, 0.0F);
      this.legFL = new ModelRenderer(this, 0, 0);
      this.legFL.addBox(1.5F, 7.5F, -1.5F, 1, 3, 1);
      this.legFL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.legFL.setTextureSize(64, 64);
      this.legFL.mirror = true;
      this.setRotation(this.legFL, -0.3490659F, 0.0F, -0.3490659F);
      this.legFR = new ModelRenderer(this, 0, 0);
      this.legFR.addBox(-2.5F, 7.5F, -1.5F, 1, 3, 1);
      this.legFR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.legFR.setTextureSize(64, 64);
      this.legFR.mirror = true;
      this.setRotation(this.legFR, -0.3490659F, 0.0F, 0.3490659F);
      this.legBL = new ModelRenderer(this, 0, 0);
      this.legBL.addBox(1.5F, 7.5F, 0.5F, 1, 3, 1);
      this.legBL.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.legBL.setTextureSize(64, 64);
      this.legBL.mirror = true;
      this.setRotation(this.legBL, 0.3490659F, 0.0F, -0.3490659F);
      this.legBR = new ModelRenderer(this, 0, 0);
      this.legBR.addBox(-2.5F, 7.5F, 0.5F, 1, 3, 1);
      this.legBR.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.legBR.setTextureSize(64, 64);
      this.legBR.mirror = true;
      this.setRotation(this.legBR, 0.3490659F, 0.0F, 0.3490659F);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.base.render(f5);
      this.bottomF.render(f5);
      this.bottomB.render(f5);
      this.bottomL.render(f5);
      this.bottomR.render(f5);
      this.sideF.render(f5);
      this.sideB.render(f5);
      this.sideL.render(f5);
      this.sideR.render(f5);
      this.neckF.render(f5);
      this.neckB.render(f5);
      this.neckL.render(f5);
      this.neckR.render(f5);
      this.lipF.render(f5);
      this.lipB.render(f5);
      this.lipL.render(f5);
      this.lipR.render(f5);
      this.legFL.render(f5);
      this.legFR.render(f5);
      this.legBL.render(f5);
      this.legBR.render(f5);
   }

   @Override
   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
   }
}
