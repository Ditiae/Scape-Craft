
package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDrymace extends ModelBase
{
  //fields
    ModelRenderer base_block_1;
    ModelRenderer base_block_2;
    ModelRenderer hilt_1;
    ModelRenderer base_block_3;
    ModelRenderer edge_blade_1;
    ModelRenderer edge_blade_2;
    ModelRenderer edge_blade_3;
    ModelRenderer edge_blade_4;
    ModelRenderer top_blade_1;
    ModelRenderer top_blade_2;
    ModelRenderer top_blade_3;
    ModelRenderer top_blade_4;
    ModelRenderer blue_blade_4;
    ModelRenderer blue_blade_1;
    ModelRenderer blue_blade_2;
    ModelRenderer blue_blade_3;
    ModelRenderer base_block_5;
    ModelRenderer edge_1;
    ModelRenderer edge_2;
    ModelRenderer edge_3;
    ModelRenderer edge_4;
    ModelRenderer edge_5;
    ModelRenderer edge_6;
    ModelRenderer edge_7;
    ModelRenderer edge_8;
    ModelRenderer base_block_8;
    ModelRenderer base_block_9;
    ModelRenderer blade_edge_bottom_1;
    ModelRenderer blade_edge_bottom_2;
    ModelRenderer blade_edge_bottom_3;
    ModelRenderer blade_edge_bottom_4;
    ModelRenderer blue_base_bottom_1;
    ModelRenderer blue_edge_piece_1;
    ModelRenderer blue_edge_piece_2;
    ModelRenderer blue_edge_piece_3;
    ModelRenderer blue_edge_piece_4;
    ModelRenderer hilt_5;
    ModelRenderer hilt_bottom_7;
    ModelRenderer hilt_bottom_6;
    ModelRenderer hilt_edge_1;
    ModelRenderer hilt_edge_2;
    ModelRenderer hilt_edge_3;
    ModelRenderer hilt_edge_4;
    ModelRenderer a44;
  
  public ModelDrymace()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      base_block_1 = new ModelRenderer(this, 120, 0);
      base_block_1.addBox(0F, 0F, 0F, 4, 25, 4);
      base_block_1.setRotationPoint(0F, -75F, 0F);
      base_block_1.setTextureSize(256, 128);
      base_block_1.mirror = true;
      setRotation(base_block_1, 0F, 0F, 0F);
      base_block_2 = new ModelRenderer(this, 167, 30);
      base_block_2.addBox(0F, 0F, 0F, 4, 25, 4);
      base_block_2.setRotationPoint(0F, -50F, 0F);
      base_block_2.setTextureSize(256, 128);
      base_block_2.mirror = true;
      setRotation(base_block_2, 0F, 0F, 0F);
      hilt_1 = new ModelRenderer(this, 166, 0);
      hilt_1.addBox(0F, 0F, 0F, 4, 25, 4);
      hilt_1.setRotationPoint(0F, -25F, 0F);
      hilt_1.setTextureSize(256, 128);
      hilt_1.mirror = true;
      setRotation(hilt_1, 0F, 0F, 0F);
      base_block_3 = new ModelRenderer(this, 100, 92);
      base_block_3.addBox(0F, 0F, 0F, 21, 14, 21);
      base_block_3.setRotationPoint(-8.5F, -90F, -8.5F);
      base_block_3.setTextureSize(256, 128);
      base_block_3.mirror = true;
      setRotation(base_block_3, 0F, 0F, 0F);
      edge_blade_1 = new ModelRenderer(this, 184, 0);
      edge_blade_1.addBox(0F, -3F, 0F, 4, 25, 4);
      edge_blade_1.setRotationPoint(-9F, -90F, -9F);
      edge_blade_1.setTextureSize(256, 128);
      edge_blade_1.mirror = true;
      setRotation(edge_blade_1, -0.2617994F, 0F, 0.2617994F);
      edge_blade_2 = new ModelRenderer(this, 202, 0);
      edge_blade_2.addBox(-1F, -2F, 0F, 4, 25, 4);
      edge_blade_2.setRotationPoint(-8F, -90F, 9F);
      edge_blade_2.setTextureSize(256, 128);
      edge_blade_2.mirror = true;
      setRotation(edge_blade_2, 0.2617994F, 0F, 0.2617994F);
      edge_blade_3 = new ModelRenderer(this, 238, 0);
      edge_blade_3.addBox(0F, -2F, 0F, 4, 25, 4);
      edge_blade_3.setRotationPoint(9F, -90F, -9F);
      edge_blade_3.setTextureSize(256, 128);
      edge_blade_3.mirror = true;
      setRotation(edge_blade_3, -0.2617994F, 0F, -0.2617994F);
      edge_blade_4 = new ModelRenderer(this, 220, 0);
      edge_blade_4.addBox(0F, -1F, 0F, 4, 25, 4);
      edge_blade_4.setRotationPoint(9F, -90F, 9F);
      edge_blade_4.setTextureSize(256, 128);
      edge_blade_4.mirror = true;
      setRotation(edge_blade_4, 0.2617994F, 0F, -0.2617994F);
      top_blade_1 = new ModelRenderer(this, 202, 30);
      top_blade_1.addBox(0F, 0F, 0F, 4, 6, 4);
      top_blade_1.setRotationPoint(10F, -96F, -10F);
      top_blade_1.setTextureSize(256, 128);
      top_blade_1.mirror = true;
      setRotation(top_blade_1, 0.2617994F, 0F, 0.2617994F);
      top_blade_2 = new ModelRenderer(this, 184, 30);
      top_blade_2.addBox(0F, 0F, 0F, 4, 6, 4);
      top_blade_2.setRotationPoint(-10F, -95F, -10F);
      top_blade_2.setTextureSize(256, 128);
      top_blade_2.mirror = true;
      setRotation(top_blade_2, 0.2617994F, 0F, -0.2617994F);
      top_blade_3 = new ModelRenderer(this, 238, 30);
      top_blade_3.addBox(0F, 0F, 0F, 4, 6, 4);
      top_blade_3.setRotationPoint(10F, -97F, 10F);
      top_blade_3.setTextureSize(256, 128);
      top_blade_3.mirror = true;
      setRotation(top_blade_3, -0.2617994F, 0F, 0.2617994F);
      top_blade_4 = new ModelRenderer(this, 220, 30);
      top_blade_4.addBox(0F, 0F, 0F, 4, 6, 4);
      top_blade_4.setRotationPoint(-10F, -96F, 10F);
      top_blade_4.setTextureSize(256, 128);
      top_blade_4.mirror = true;
      setRotation(top_blade_4, -0.2617994F, 0F, -0.2617994F);
      blue_blade_4 = new ModelRenderer(this, 160, 70);
      blue_blade_4.addBox(0F, 0F, 0F, 4, 13, 4);
      blue_blade_4.setRotationPoint(0F, -84F, 8F);
      blue_blade_4.setTextureSize(256, 128);
      blue_blade_4.mirror = true;
      setRotation(blue_blade_4, 0.2617994F, 0F, 0F);
      blue_blade_1 = new ModelRenderer(this, 120, 70);
      blue_blade_1.addBox(0F, 0F, 0F, 4, 13, 4);
      blue_blade_1.setRotationPoint(0F, -85F, -8F);
      blue_blade_1.setTextureSize(256, 128);
      blue_blade_1.mirror = true;
      setRotation(blue_blade_1, -0.2617994F, 0F, 0F);
      blue_blade_2 = new ModelRenderer(this, 140, 70);
      blue_blade_2.addBox(0F, 0F, 0F, 4, 13, 4);
      blue_blade_2.setRotationPoint(-8F, -85F, 0F);
      blue_blade_2.setTextureSize(256, 128);
      blue_blade_2.mirror = true;
      setRotation(blue_blade_2, 0F, 0F, 0.2617994F);
      blue_blade_3 = new ModelRenderer(this, 100, 70);
      blue_blade_3.addBox(0F, 0F, 0F, 4, 13, 4);
      blue_blade_3.setRotationPoint(8F, -84F, 0F);
      blue_blade_3.setTextureSize(256, 128);
      blue_blade_3.mirror = true;
      setRotation(blue_blade_3, 0F, 0F, -0.2617994F);
      base_block_5 = new ModelRenderer(this, 0, 61);
      base_block_5.addBox(0F, 0F, 0F, 24, 6, 24);
      base_block_5.setRotationPoint(-10F, -77F, -10F);
      base_block_5.setTextureSize(256, 128);
      base_block_5.mirror = true;
      setRotation(base_block_5, 0F, 0F, 0F);
      edge_1 = new ModelRenderer(this, 70, 50);
      edge_1.addBox(0F, 0F, 0F, 13, 4, 4);
      edge_1.setRotationPoint(10F, -75F, 0F);
      edge_1.setTextureSize(256, 128);
      edge_1.mirror = true;
      setRotation(edge_1, 0F, 1.308997F, 0.0872665F);
      edge_2 = new ModelRenderer(this, 70, 40);
      edge_2.addBox(0F, 0F, 0F, 13, 4, 4);
      edge_2.setRotationPoint(14F, -75F, 3F);
      edge_2.setTextureSize(256, 128);
      edge_2.mirror = true;
      setRotation(edge_2, 0F, -1.308997F, 0.0872665F);
      edge_3 = new ModelRenderer(this, 35, 50);
      edge_3.addBox(0F, 0F, 0F, 13, 4, 4);
      edge_3.setRotationPoint(-10F, -75F, 1F);
      edge_3.setTextureSize(256, 128);
      edge_3.mirror = true;
      setRotation(edge_3, 0F, 1.832596F, 0.0872665F);
      edge_4 = new ModelRenderer(this, 0, 30);
      edge_4.addBox(0F, 0F, 0F, 13, 4, 4);
      edge_4.setRotationPoint(-6F, -75F, 4F);
      edge_4.setTextureSize(256, 128);
      edge_4.mirror = true;
      setRotation(edge_4, 0F, -1.832596F, 0.0872665F);
      edge_5 = new ModelRenderer(this, 35, 30);
      edge_5.addBox(3F, 0F, 0F, 13, 4, 4);
      edge_5.setRotationPoint(0F, -76F, -9F);
      edge_5.setTextureSize(256, 128);
      edge_5.mirror = true;
      setRotation(edge_5, 0F, 0.2617994F, 0.0872665F);
      edge_6 = new ModelRenderer(this, 35, 40);
      edge_6.addBox(0F, 0F, -1F, 13, 4, 4);
      edge_6.setRotationPoint(-10F, -75F, -12F);
      edge_6.setTextureSize(256, 128);
      edge_6.mirror = true;
      setRotation(edge_6, 0F, -0.2617994F, -0.0872665F);
      edge_6.mirror = false;
      edge_7 = new ModelRenderer(this, 0, 50);
      edge_7.addBox(4F, 0F, 0F, 13, 4, 4);
      edge_7.setRotationPoint(0F, -75F, 9F);
      edge_7.setTextureSize(256, 128);
      edge_7.mirror = true;
      setRotation(edge_7, 0F, -0.2617994F, 0.0872665F);
      edge_8 = new ModelRenderer(this, 0, 40);
      edge_8.addBox(0F, 0F, 0F, 13, 4, 4);
      edge_8.setRotationPoint(-12F, -73.5F, 13.46667F);
      edge_8.setTextureSize(256, 128);
      edge_8.mirror = true;
      setRotation(edge_8, 0F, 0.2617994F, -0.0872665F);
      base_block_8 = new ModelRenderer(this, 0, 0);
      base_block_8.addBox(0F, 0F, 0F, 14, 12, 14);
      base_block_8.setRotationPoint(-5F, -74F, -5F);
      base_block_8.setTextureSize(256, 128);
      base_block_8.mirror = true;
      setRotation(base_block_8, 0F, 0F, 0F);
      base_block_9 = new ModelRenderer(this, 215, 63);
      base_block_9.addBox(0F, 0F, 0F, 10, 15, 10);
      base_block_9.setRotationPoint(-3F, -62F, -3F);
      base_block_9.setTextureSize(256, 128);
      base_block_9.mirror = true;
      setRotation(base_block_9, 0F, 0F, 0F);
      blade_edge_bottom_1 = new ModelRenderer(this, 202, 42);
      blade_edge_bottom_1.addBox(0F, 0F, 0F, 4, 15, 4);
      blade_edge_bottom_1.setRotationPoint(4F, -73.5F, -4F);
      blade_edge_bottom_1.setTextureSize(256, 128);
      blade_edge_bottom_1.mirror = true;
      setRotation(blade_edge_bottom_1, -0.2617994F, 0F, -0.2617994F);
      blade_edge_bottom_2 = new ModelRenderer(this, 184, 42);
      blade_edge_bottom_2.addBox(0F, 0F, 0F, 4, 15, 4);
      blade_edge_bottom_2.setRotationPoint(-4F, -74F, -4F);
      blade_edge_bottom_2.setTextureSize(256, 128);
      blade_edge_bottom_2.mirror = true;
      setRotation(blade_edge_bottom_2, -0.2617994F, 0F, 0.2617994F);
      blade_edge_bottom_3 = new ModelRenderer(this, 238, 42);
      blade_edge_bottom_3.addBox(-5F, 0F, 5F, 4, 15, 4);
      blade_edge_bottom_3.setRotationPoint(0F, -71F, 0F);
      blade_edge_bottom_3.setTextureSize(256, 128);
      blade_edge_bottom_3.mirror = true;
      setRotation(blade_edge_bottom_3, 0.2617994F, 0F, 0.2617994F);
      blade_edge_bottom_4 = new ModelRenderer(this, 220, 42);
      blade_edge_bottom_4.addBox(0F, 0F, 0F, 4, 15, 4);
      blade_edge_bottom_4.setRotationPoint(4F, -73F, 4F);
      blade_edge_bottom_4.setTextureSize(256, 128);
      blade_edge_bottom_4.mirror = true;
      setRotation(blade_edge_bottom_4, 0.2617994F, 0F, -0.2617994F);
      blue_base_bottom_1 = new ModelRenderer(this, 34, 107);
      blue_base_bottom_1.addBox(0F, 0F, 0F, 16, 4, 16);
      blue_base_bottom_1.setRotationPoint(-6F, -64.6F, -6F);
      blue_base_bottom_1.setTextureSize(256, 128);
      blue_base_bottom_1.mirror = true;
      setRotation(blue_base_bottom_1, 0F, 0F, 0F);
      blue_edge_piece_1 = new ModelRenderer(this, 80, 0);
      blue_edge_piece_1.addBox(0F, 0F, 0F, 2, 14, 2);
      blue_edge_piece_1.setRotationPoint(-4F, -65F, 6F);
      blue_edge_piece_1.setTextureSize(256, 128);
      blue_edge_piece_1.mirror = true;
      setRotation(blue_edge_piece_1, 0F, 0F, 0F);
      blue_edge_piece_2 = new ModelRenderer(this, 60, 0);
      blue_edge_piece_2.addBox(0F, 0F, 0F, 2, 14, 2);
      blue_edge_piece_2.setRotationPoint(6F, -65F, -4F);
      blue_edge_piece_2.setTextureSize(256, 128);
      blue_edge_piece_2.mirror = true;
      setRotation(blue_edge_piece_2, 0F, 0F, 0F);
      blue_edge_piece_3 = new ModelRenderer(this, 70, 0);
      blue_edge_piece_3.addBox(0F, 0F, 0F, 2, 14, 2);
      blue_edge_piece_3.setRotationPoint(6F, -65F, 6F);
      blue_edge_piece_3.setTextureSize(256, 128);
      blue_edge_piece_3.mirror = true;
      setRotation(blue_edge_piece_3, 0F, 0F, 0F);
      blue_edge_piece_4 = new ModelRenderer(this, 90, 0);
      blue_edge_piece_4.addBox(0F, 0F, 0F, 2, 14, 2);
      blue_edge_piece_4.setRotationPoint(-4F, -65F, -4F);
      blue_edge_piece_4.setTextureSize(256, 128);
      blue_edge_piece_4.mirror = true;
      setRotation(blue_edge_piece_4, 0F, 0F, 0F);
      hilt_5 = new ModelRenderer(this, 189, 63);
      hilt_5.addBox(0F, 0F, 0F, 6, 20, 6);
      hilt_5.setRotationPoint(-1F, -47F, -1F);
      hilt_5.setTextureSize(256, 128);
      hilt_5.mirror = true;
      setRotation(hilt_5, 0F, 0F, 0F);
      hilt_bottom_7 = new ModelRenderer(this, 231, 104);
      hilt_bottom_7.addBox(0F, 0F, 0F, 6, 10, 6);
      hilt_bottom_7.setRotationPoint(-1F, -10F, -1F);
      hilt_bottom_7.setTextureSize(256, 128);
      hilt_bottom_7.mirror = true;
      setRotation(hilt_bottom_7, 0F, 0F, 0F);
      hilt_bottom_6 = new ModelRenderer(this, 0, 114);
      hilt_bottom_6.addBox(0F, 0F, 0F, 8, 5, 8);
      hilt_bottom_6.setRotationPoint(-2F, -7F, -2F);
      hilt_bottom_6.setTextureSize(256, 128);
      hilt_bottom_6.mirror = true;
      setRotation(hilt_bottom_6, 0F, 0F, 0F);
      hilt_edge_1 = new ModelRenderer(this, 247, 90);
      hilt_edge_1.addBox(0F, 0F, 0F, 2, 10, 2);
      hilt_edge_1.setRotationPoint(-2F, -10F, -2F);
      hilt_edge_1.setTextureSize(256, 128);
      hilt_edge_1.mirror = true;
      setRotation(hilt_edge_1, -0.2617994F, 0F, 0.2617994F);
      hilt_edge_2 = new ModelRenderer(this, 218, 90);
      hilt_edge_2.addBox(0F, 0F, 0F, 2, 10, 2);
      hilt_edge_2.setRotationPoint(4F, -10F, -2F);
      hilt_edge_2.setTextureSize(256, 128);
      hilt_edge_2.mirror = true;
      setRotation(hilt_edge_2, -0.2617994F, 0F, -0.2617994F);
      hilt_edge_3 = new ModelRenderer(this, 237, 90);
      hilt_edge_3.addBox(0F, 0F, 0F, 2, 10, 2);
      hilt_edge_3.setRotationPoint(-2F, -10F, 4F);
      hilt_edge_3.setTextureSize(256, 128);
      hilt_edge_3.mirror = true;
      setRotation(hilt_edge_3, 0.2617994F, 0F, 0.2617994F);
      hilt_edge_4 = new ModelRenderer(this, 228, 90);
      hilt_edge_4.addBox(0F, 0F, 0F, 2, 10, 2);
      hilt_edge_4.setRotationPoint(4F, -10F, 4F);
      hilt_edge_4.setTextureSize(256, 128);
      hilt_edge_4.mirror = true;
      setRotation(hilt_edge_4, 0.2617994F, 0F, -0.2617994F);
      a44 = new ModelRenderer(this, 100, 0);
      a44.addBox(0F, 0F, 0F, 4, 25, 4);
      a44.setRotationPoint(0F, -92F, 0F);
      a44.setTextureSize(256, 128);
      a44.mirror = true;
      setRotation(a44, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base_block_1.render(f5);
    base_block_2.render(f5);
    hilt_1.render(f5);
    base_block_3.render(f5);
    edge_blade_1.render(f5);
    edge_blade_2.render(f5);
    edge_blade_3.render(f5);
    edge_blade_4.render(f5);
    top_blade_1.render(f5);
    top_blade_2.render(f5);
    top_blade_3.render(f5);
    top_blade_4.render(f5);
    blue_blade_4.render(f5);
    blue_blade_1.render(f5);
    blue_blade_2.render(f5);
    blue_blade_3.render(f5);
    base_block_5.render(f5);
    edge_1.render(f5);
    edge_2.render(f5);
    edge_3.render(f5);
    edge_4.render(f5);
    edge_5.render(f5);
    edge_6.render(f5);
    edge_7.render(f5);
    edge_8.render(f5);
    base_block_8.render(f5);
    base_block_9.render(f5);
    blade_edge_bottom_1.render(f5);
    blade_edge_bottom_2.render(f5);
    blade_edge_bottom_3.render(f5);
    blade_edge_bottom_4.render(f5);
    blue_base_bottom_1.render(f5);
    blue_edge_piece_1.render(f5);
    blue_edge_piece_2.render(f5);
    blue_edge_piece_3.render(f5);
    blue_edge_piece_4.render(f5);
    hilt_5.render(f5);
    hilt_bottom_7.render(f5);
    hilt_bottom_6.render(f5);
    hilt_edge_1.render(f5);
    hilt_edge_2.render(f5);
    hilt_edge_3.render(f5);
    hilt_edge_4.render(f5);
    a44.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}
}
