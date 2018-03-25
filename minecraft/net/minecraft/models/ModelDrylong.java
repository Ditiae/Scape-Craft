package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDrylong extends ModelBase
{
  //fields
    ModelRenderer hilt;
    ModelRenderer base_hilt_top;
    ModelRenderer top_hilt_1;
    ModelRenderer top_hilt_2;
    ModelRenderer main_base_1;
    ModelRenderer main_base_2;
    ModelRenderer main_base_3;
    ModelRenderer main_base_4;
    ModelRenderer main_base_5;
    ModelRenderer small_blade_part_1;
    ModelRenderer small_blade_part_2;
    ModelRenderer small_blade_part;
    ModelRenderer main_base_6;
    ModelRenderer main_base_7;
    ModelRenderer main_base_8;
    ModelRenderer main_base_9;
    ModelRenderer main_base_10;
    ModelRenderer main_base_11;
    ModelRenderer main_base_12;
    ModelRenderer main_base_13;
    ModelRenderer main_base_14;
    ModelRenderer main_base_15;
    ModelRenderer hook_blade_2_part_1;
    ModelRenderer hook_blade_2_part_2;
    ModelRenderer main_base_16;
    ModelRenderer main_base_17;
    ModelRenderer small_blade_part_3;
    ModelRenderer main_base_18;
    ModelRenderer main_base_19;
    ModelRenderer main_base_20;
    ModelRenderer hook_blade_2_part_3;
    ModelRenderer hook_blade_2_part_4;
    ModelRenderer hook_blade_2_part_5;
    ModelRenderer hook_blade_1_part_1;
    ModelRenderer hook_blade_1_part_2;
    ModelRenderer hook_blade_1_part_3;
    ModelRenderer main_base_21;
    ModelRenderer main_base_22;
    ModelRenderer main_base_23;
    ModelRenderer main_blade_frame_1;
    ModelRenderer main_blade_frame_2;
    ModelRenderer main_blade_asset_1;
    ModelRenderer main_blade_frame_3;
    ModelRenderer main_blade_frame_4;
    ModelRenderer main_blade_frame_5;
    ModelRenderer main_blade_frame_6;
    ModelRenderer main_blade_frame_7;
    ModelRenderer main_blade_frame_8;
    ModelRenderer blade_top_1;
    ModelRenderer blade_edge_1;
    ModelRenderer blade_top_2;
    ModelRenderer blade_edge_2;
    ModelRenderer blade_edge_3;
    ModelRenderer blade_edge_4;
    ModelRenderer blade_edge_5;
    ModelRenderer blade_edge_6;
    ModelRenderer blade_edge_7;
    ModelRenderer blade_edge_8;
    ModelRenderer blade_edge_9;
    ModelRenderer blade_edge_10;
    ModelRenderer blade_edge_11;
    ModelRenderer blade_edge_12;
    ModelRenderer blade_edge_13;
    ModelRenderer blade_edge_14;
    ModelRenderer blade_edge_15;
    ModelRenderer blade_edge_16;
    ModelRenderer blade_edge_17;
    ModelRenderer blade_edge_18;
    ModelRenderer blade_edge_19;
    ModelRenderer blade_edge_20;
    ModelRenderer blade_edge_21;
    ModelRenderer blade_hook_edge_base_2;
    ModelRenderer blade_hook_edge_base_1;
    ModelRenderer blade_hook_edge_base_3;
    ModelRenderer blade_hook_edge_base_4;
    ModelRenderer blade_hook_edge_base_5;
    ModelRenderer blade_hook_edge_base_6;
    ModelRenderer blade_hook_edge_base_7;
    ModelRenderer blade_hook_edge_base_8;
    ModelRenderer blade_2_hook_edge_base_1;
    ModelRenderer blade_2_hook_edge_base_2;
    ModelRenderer blade_2_hook_edge_base_3;
    ModelRenderer blade_2_hook_edge_base_4;
    ModelRenderer blade_edge_22;
    ModelRenderer blade_edge_23;
    ModelRenderer blade_edge_24;
    ModelRenderer blade_edge_25;
    ModelRenderer blade_hook_4_1;
    ModelRenderer ablade_hook_4_1;
    ModelRenderer blade_hilt_edge_1;
    ModelRenderer blade_hilt_edge_2;
  
  public ModelDrylong()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      hilt = new ModelRenderer(this, 201, 70);
      hilt.addBox(0F, 0F, 0F, 6, 24, 6);
      hilt.setRotationPoint(-3F, -10F, -3F);
      hilt.setTextureSize(256, 128);
      hilt.mirror = true;
      setRotation(hilt, 0F, 0F, 0F);
      base_hilt_top = new ModelRenderer(this, 160, 83);
      base_hilt_top.addBox(0F, 0F, 0F, 10, 7, 10);
      base_hilt_top.setRotationPoint(-5F, 14F, -5F);
      base_hilt_top.setTextureSize(256, 128);
      base_hilt_top.mirror = true;
      setRotation(base_hilt_top, 0F, 0F, 0F);
      top_hilt_1 = new ModelRenderer(this, 142, 70);
      top_hilt_1.addBox(0F, 0F, 0F, 6, 1, 10);
      top_hilt_1.setRotationPoint(-3F, -11F, -3F);
      top_hilt_1.setTextureSize(256, 128);
      top_hilt_1.mirror = true;
      setRotation(top_hilt_1, 0F, 0F, 0F);
      top_hilt_2 = new ModelRenderer(this, 105, 76);
      top_hilt_2.addBox(0F, 0F, 0F, 6, 2, 12);
      top_hilt_2.setRotationPoint(-3F, -13F, -3F);
      top_hilt_2.setTextureSize(256, 128);
      top_hilt_2.mirror = true;
      setRotation(top_hilt_2, 0F, 0F, 0F);
      main_base_1 = new ModelRenderer(this, 90, 91);
      main_base_1.addBox(0F, 0F, 0F, 6, 2, 16);
      main_base_1.setRotationPoint(-3F, -15F, -3F);
      main_base_1.setTextureSize(256, 128);
      main_base_1.mirror = true;
      setRotation(main_base_1, 0F, 0F, 0F);
      main_base_2 = new ModelRenderer(this, 65, 91);
      main_base_2.addBox(0F, 0F, 0F, 6, 6, 6);
      main_base_2.setRotationPoint(-3F, -21F, 9F);
      main_base_2.setTextureSize(256, 128);
      main_base_2.mirror = true;
      setRotation(main_base_2, 0F, 0F, 0F);
      main_base_3 = new ModelRenderer(this, 0, 89);
      main_base_3.addBox(0F, 0F, 0F, 6, 6, 16);
      main_base_3.setRotationPoint(-3F, -21F, -7F);
      main_base_3.setTextureSize(256, 128);
      main_base_3.mirror = true;
      setRotation(main_base_3, 0F, 0F, 0F);
      main_base_4 = new ModelRenderer(this, 135, 92);
      main_base_4.addBox(0F, 0F, 0F, 6, 6, 6);
      main_base_4.setRotationPoint(-3F, -24F, 11F);
      main_base_4.setTextureSize(256, 128);
      main_base_4.mirror = true;
      setRotation(main_base_4, 0F, 0F, 0F);
      main_base_5 = new ModelRenderer(this, 175, 70);
      main_base_5.addBox(0F, 0F, 0F, 6, 6, 6);
      main_base_5.setRotationPoint(-3F, -28F, 13F);
      main_base_5.setTextureSize(256, 128);
      main_base_5.mirror = true;
      setRotation(main_base_5, 0F, 0F, 0F);
      small_blade_part_1 = new ModelRenderer(this, 134, 22);
      small_blade_part_1.addBox(0F, 0F, 0F, 4, 9, 4);
      small_blade_part_1.setRotationPoint(-2F, -37F, 15F);
      small_blade_part_1.setTextureSize(256, 128);
      small_blade_part_1.mirror = true;
      setRotation(small_blade_part_1, 0F, 0F, 0F);
      small_blade_part_2 = new ModelRenderer(this, 238, 18);
      small_blade_part_2.addBox(0F, 0F, 0F, 4, 2, 5);
      small_blade_part_2.setRotationPoint(-2F, -39F, 15F);
      small_blade_part_2.setTextureSize(256, 128);
      small_blade_part_2.mirror = true;
      setRotation(small_blade_part_2, 0F, 0F, 0F);
      small_blade_part = new ModelRenderer(this, 117, 21);
      small_blade_part.addBox(0F, 0F, 0F, 4, 2, 4);
      small_blade_part.setRotationPoint(-2F, -41F, 17F);
      small_blade_part.setTextureSize(256, 128);
      small_blade_part.mirror = true;
      setRotation(small_blade_part, 0F, 0F, 0F);
      main_base_6 = new ModelRenderer(this, 66, 70);
      main_base_6.addBox(0F, 0F, 0F, 6, 6, 13);
      main_base_6.setRotationPoint(-3F, -25F, -11F);
      main_base_6.setTextureSize(256, 128);
      main_base_6.mirror = true;
      setRotation(main_base_6, 0F, 0F, 0F);
      main_base_7 = new ModelRenderer(this, 105, 70);
      main_base_7.addBox(0F, 0F, -1F, 6, 2, 2);
      main_base_7.setRotationPoint(-3F, -23F, 3F);
      main_base_7.setTextureSize(256, 128);
      main_base_7.mirror = true;
      setRotation(main_base_7, 0F, 0F, 0F);
      main_base_8 = new ModelRenderer(this, 226, 80);
      main_base_8.addBox(0F, 0F, 0F, 6, 2, 2);
      main_base_8.setRotationPoint(-3F, -15F, -5F);
      main_base_8.setTextureSize(256, 128);
      main_base_8.mirror = true;
      setRotation(main_base_8, 0F, 0F, 0F);
      main_base_9 = new ModelRenderer(this, 45, 95);
      main_base_9.addBox(0F, 0F, 0F, 6, 2, 2);
      main_base_9.setRotationPoint(-3F, -19F, -9F);
      main_base_9.setTextureSize(256, 128);
      main_base_9.mirror = true;
      setRotation(main_base_9, 0F, 0F, 0F);
      main_base_10 = new ModelRenderer(this, 226, 76);
      main_base_10.addBox(0F, 0F, 0F, 6, 1, 1);
      main_base_10.setRotationPoint(-3F, -13F, -4F);
      main_base_10.setTextureSize(256, 128);
      main_base_10.mirror = true;
      setRotation(main_base_10, 0F, 0F, 0F);
      main_base_11 = new ModelRenderer(this, 0, 0);
      main_base_11.addBox(-3F, -15F, -6F, 6, 1, 1);
      main_base_11.setRotationPoint(0F, 0F, 0F);
      main_base_11.setTextureSize(256, 128);
      main_base_11.mirror = true;
      setRotation(main_base_11, 0F, 0F, 0F);
      main_base_12 = new ModelRenderer(this, 75, 105);
      main_base_12.addBox(-3F, -10F, 3F, 6, 1, 1);
      main_base_12.setRotationPoint(0F, 0F, 0F);
      main_base_12.setTextureSize(256, 128);
      main_base_12.mirror = true;
      setRotation(main_base_12, 0F, 0F, 0F);
      main_base_13 = new ModelRenderer(this, 45, 103);
      main_base_13.addBox(-3F, -13F, 9F, 6, 1, 2);
      main_base_13.setRotationPoint(0F, 0F, 0F);
      main_base_13.setTextureSize(256, 128);
      main_base_13.mirror = true;
      setRotation(main_base_13, 0F, 0F, 0F);
      main_base_14 = new ModelRenderer(this, 226, 85);
      main_base_14.addBox(-3F, -22F, 17F, 6, 4, 1);
      main_base_14.setRotationPoint(0F, 0F, 0F);
      main_base_14.setTextureSize(256, 128);
      main_base_14.mirror = true;
      setRotation(main_base_14, 0F, 0F, 0F);
      main_base_15 = new ModelRenderer(this, 0, 0);
      main_base_15.addBox(-3F, -13F, 9F, 6, 1, 1);
      main_base_15.setRotationPoint(0F, 0F, 0F);
      main_base_15.setTextureSize(256, 128);
      main_base_15.mirror = true;
      setRotation(main_base_15, 0F, 0F, 0F);
      hook_blade_2_part_1 = new ModelRenderer(this, 38, 50);
      hook_blade_2_part_1.addBox(-4F, -15F, 14F, 8, 2, 3);
      hook_blade_2_part_1.setRotationPoint(0F, 0F, 0F);
      hook_blade_2_part_1.setTextureSize(256, 128);
      hook_blade_2_part_1.mirror = true;
      setRotation(hook_blade_2_part_1, 0F, 0F, 0F);
      hook_blade_2_part_2 = new ModelRenderer(this, 38, 56);
      hook_blade_2_part_2.addBox(-4F, -18F, 15F, 8, 3, 4);
      hook_blade_2_part_2.setRotationPoint(0F, 0F, 0F);
      hook_blade_2_part_2.setTextureSize(256, 128);
      hook_blade_2_part_2.mirror = true;
      setRotation(hook_blade_2_part_2, 0F, 0F, 0F);
      main_base_16 = new ModelRenderer(this, 45, 100);
      main_base_16.addBox(0F, 0F, 0F, 6, 1, 1);
      main_base_16.setRotationPoint(-3F, -17F, -8F);
      main_base_16.setTextureSize(256, 128);
      main_base_16.mirror = true;
      setRotation(main_base_16, 0F, -0.0349066F, 0F);
      main_base_17 = new ModelRenderer(this, 45, 90);
      main_base_17.addBox(-3F, -19F, -10F, 6, 1, 1);
      main_base_17.setRotationPoint(0F, 0F, 0F);
      main_base_17.setTextureSize(256, 128);
      main_base_17.mirror = true;
      setRotation(main_base_17, 0F, 0F, 0F);
      small_blade_part_3 = new ModelRenderer(this, 137, 19);
      small_blade_part_3.addBox(-2F, -40F, 16F, 4, 1, 1);
      small_blade_part_3.setRotationPoint(0F, 0F, 0F);
      small_blade_part_3.setTextureSize(256, 128);
      small_blade_part_3.mirror = true;
      setRotation(small_blade_part_3, 0F, 0F, 0F);
      main_base_18 = new ModelRenderer(this, 142, 86);
      main_base_18.addBox(-3F, -22F, 10F, 6, 1, 1);
      main_base_18.setRotationPoint(0F, 0F, 0F);
      main_base_18.setTextureSize(256, 128);
      main_base_18.mirror = true;
      setRotation(main_base_18, 0F, 0F, 0F);
      main_base_19 = new ModelRenderer(this, 142, 82);
      main_base_19.addBox(-3F, -26F, 12F, 6, 2, 1);
      main_base_19.setRotationPoint(0F, 0F, 0F);
      main_base_19.setTextureSize(256, 128);
      main_base_19.mirror = true;
      setRotation(main_base_19, 0F, 0F, 0F);
      main_base_20 = new ModelRenderer(this, 130, 70);
      main_base_20.addBox(-2F, -30F, 14F, 4, 2, 1);
      main_base_20.setRotationPoint(0F, 0F, 0F);
      main_base_20.setTextureSize(256, 128);
      main_base_20.mirror = true;
      setRotation(main_base_20, 0F, 0F, 0F);
      hook_blade_2_part_3 = new ModelRenderer(this, 38, 43);
      hook_blade_2_part_3.addBox(-4F, -15F, 17F, 8, 3, 3);
      hook_blade_2_part_3.setRotationPoint(0F, 0F, 0F);
      hook_blade_2_part_3.setTextureSize(256, 128);
      hook_blade_2_part_3.mirror = true;
      setRotation(hook_blade_2_part_3, 0F, 0F, 0F);
      hook_blade_2_part_4 = new ModelRenderer(this, 38, 38);
      hook_blade_2_part_4.addBox(-4F, -12F, 18F, 8, 2, 2);
      hook_blade_2_part_4.setRotationPoint(0F, 0F, 0F);
      hook_blade_2_part_4.setTextureSize(256, 128);
      hook_blade_2_part_4.mirror = true;
      setRotation(hook_blade_2_part_4, 0F, 0F, 0F);
      hook_blade_2_part_5 = new ModelRenderer(this, 38, 31);
      hook_blade_2_part_5.addBox(-4F, -13F, 20F, 8, 5, 1);
      hook_blade_2_part_5.setRotationPoint(0F, 0F, 0F);
      hook_blade_2_part_5.setTextureSize(256, 128);
      hook_blade_2_part_5.mirror = true;
      setRotation(hook_blade_2_part_5, 0F, 0F, 0F);
      hook_blade_1_part_1 = new ModelRenderer(this, 0, 43);
      hook_blade_1_part_1.addBox(-4F, -25F, 18F, 8, 1, 4);
      hook_blade_1_part_1.setRotationPoint(0F, 0F, 0F);
      hook_blade_1_part_1.setTextureSize(256, 128);
      hook_blade_1_part_1.mirror = true;
      setRotation(hook_blade_1_part_1, 0F, 0F, 0F);
      hook_blade_1_part_2 = new ModelRenderer(this, 0, 49);
      hook_blade_1_part_2.addBox(-3F, -24F, 17F, 8, 1, 7);
      hook_blade_1_part_2.setRotationPoint(-1F, 0F, 0F);
      hook_blade_1_part_2.setTextureSize(256, 128);
      hook_blade_1_part_2.mirror = true;
      setRotation(hook_blade_1_part_2, 0F, 0F, 0F);
      hook_blade_1_part_3 = new ModelRenderer(this, 0, 58);
      hook_blade_1_part_3.addBox(-3F, -23F, 21F, 8, 1, 4);
      hook_blade_1_part_3.setRotationPoint(-1F, 0F, 0F);
      hook_blade_1_part_3.setTextureSize(256, 128);
      hook_blade_1_part_3.mirror = true;
      setRotation(hook_blade_1_part_3, 0F, 0F, 0F);
      main_base_21 = new ModelRenderer(this, 226, 70);
      main_base_21.addBox(-3F, -26F, 16F, 6, 1, 4);
      main_base_21.setRotationPoint(0F, 0F, 0F);
      main_base_21.setTextureSize(256, 128);
      main_base_21.mirror = true;
      setRotation(main_base_21, 0F, 0F, 0F);
      main_base_22 = new ModelRenderer(this, 29, 70);
      main_base_22.addBox(-3F, -29F, -14F, 6, 6, 12);
      main_base_22.setRotationPoint(0F, 0F, 0F);
      main_base_22.setTextureSize(256, 128);
      main_base_22.mirror = true;
      setRotation(main_base_22, 0F, 0F, 0F);
      main_base_23 = new ModelRenderer(this, 0, 70);
      main_base_23.addBox(-3F, -34F, -15F, 6, 6, 8);
      main_base_23.setRotationPoint(0F, 0F, 0F);
      main_base_23.setTextureSize(256, 128);
      main_base_23.mirror = true;
      setRotation(main_base_23, 0F, 0F, 0F);
      main_blade_frame_1 = new ModelRenderer(this, 151, 22);
      main_blade_frame_1.addBox(-2F, -44F, -17F, 6, 10, 8);
      main_blade_frame_1.setRotationPoint(-1F, 0F, 0F);
      main_blade_frame_1.setTextureSize(256, 128);
      main_blade_frame_1.mirror = true;
      setRotation(main_blade_frame_1, 0F, 0F, 0F);
      main_blade_frame_2 = new ModelRenderer(this, 181, 16);
      main_blade_frame_2.addBox(-2F, -50F, -17F, 4, 6, 8);
      main_blade_frame_2.setRotationPoint(0F, 0F, 0F);
      main_blade_frame_2.setTextureSize(256, 128);
      main_blade_frame_2.mirror = true;
      setRotation(main_blade_frame_2, 0F, 0F, 0F);
      main_blade_asset_1 = new ModelRenderer(this, 119, 28);
      main_blade_asset_1.addBox(-3F, -39F, -15F, 6, 11, 1);
      main_blade_asset_1.setRotationPoint(0F, 0F, 8F);
      main_blade_asset_1.setTextureSize(256, 128);
      main_blade_asset_1.mirror = true;
      setRotation(main_blade_asset_1, 0F, 0F, 0F);
      main_blade_frame_3 = new ModelRenderer(this, 210, 21);
      main_blade_frame_3.addBox(0F, -2F, -3F, 4, 12, 8);
      main_blade_frame_3.setRotationPoint(-2F, -60F, -12F);
      main_blade_frame_3.setTextureSize(256, 128);
      main_blade_frame_3.mirror = true;
      setRotation(main_blade_frame_3, 0F, 0F, 0F);
      main_blade_frame_4 = new ModelRenderer(this, 210, 0);
      main_blade_frame_4.addBox(0F, 0F, 0F, 4, 12, 8);
      main_blade_frame_4.setRotationPoint(-2F, -74F, -13F);
      main_blade_frame_4.setTextureSize(256, 128);
      main_blade_frame_4.mirror = true;
      setRotation(main_blade_frame_4, 0F, 0F, 0F);
      main_blade_frame_5 = new ModelRenderer(this, 185, 0);
      main_blade_frame_5.addBox(0F, 0F, 0F, 4, 9, 6);
      main_blade_frame_5.setRotationPoint(-2F, -83F, -10F);
      main_blade_frame_5.setTextureSize(256, 128);
      main_blade_frame_5.mirror = true;
      setRotation(main_blade_frame_5, 0F, 0F, 0F);
      main_blade_frame_6 = new ModelRenderer(this, 145, 0);
      main_blade_frame_6.addBox(0F, 0F, 0F, 4, 5, 5);
      main_blade_frame_6.setRotationPoint(-2F, -88F, -6F);
      main_blade_frame_6.setTextureSize(256, 128);
      main_blade_frame_6.mirror = true;
      setRotation(main_blade_frame_6, 0F, 0F, 0F);
      main_blade_frame_7 = new ModelRenderer(this, 94, 0);
      main_blade_frame_7.addBox(-3F, -87F, -3F, 4, 9, 4);
      main_blade_frame_7.setRotationPoint(1F, -8F, 0F);
      main_blade_frame_7.setTextureSize(256, 128);
      main_blade_frame_7.mirror = true;
      setRotation(main_blade_frame_7, 0F, 0F, 0F);
      main_blade_frame_8 = new ModelRenderer(this, 75, 4);
      main_blade_frame_8.addBox(-3F, -103F, 1F, 4, 12, 3);
      main_blade_frame_8.setRotationPoint(1F, 0F, 0F);
      main_blade_frame_8.setTextureSize(256, 128);
      main_blade_frame_8.mirror = true;
      setRotation(main_blade_frame_8, 0F, 0F, 0F);
      blade_top_1 = new ModelRenderer(this, 60, 0);
      blade_top_1.addBox(-3F, 0F, 0F, 4, 24, 1);
      blade_top_1.setRotationPoint(1F, -111F, 3F);
      blade_top_1.setTextureSize(256, 128);
      blade_top_1.mirror = true;
      setRotation(blade_top_1, 0F, 0F, 0F);
      blade_edge_1 = new ModelRenderer(this, 75, 20);
      blade_edge_1.addBox(-3F, 6F, 0F, 4, 5, 1);
      blade_edge_1.setRotationPoint(1F, -106F, 0F);
      blade_edge_1.setTextureSize(256, 128);
      blade_edge_1.mirror = true;
      setRotation(blade_edge_1, 0F, 0F, 0F);
      blade_top_2 = new ModelRenderer(this, 45, 0);
      blade_top_2.addBox(-3F, 0F, 0F, 4, 19, 1);
      blade_top_2.setRotationPoint(1F, -108F, 4F);
      blade_top_2.setTextureSize(256, 128);
      blade_top_2.mirror = true;
      setRotation(blade_top_2, 0F, 0F, 0F);
      blade_edge_2 = new ModelRenderer(this, 115, 0);
      blade_edge_2.addBox(0F, 0F, -1F, 4, 3, 1);
      blade_edge_2.setRotationPoint(-2F, -98F, 0F);
      blade_edge_2.setTextureSize(256, 128);
      blade_edge_2.mirror = true;
      setRotation(blade_edge_2, 0F, 0F, 0F);
      blade_edge_3 = new ModelRenderer(this, 115, 9);
      blade_edge_3.addBox(0F, 0F, 0F, 4, 3, 2);
      blade_edge_3.setRotationPoint(-2F, -91F, -5F);
      blade_edge_3.setTextureSize(256, 128);
      blade_edge_3.mirror = true;
      setRotation(blade_edge_3, 0F, 0F, 0F);
      blade_edge_4 = new ModelRenderer(this, 168, 5);
      blade_edge_4.addBox(0F, 0F, -7F, 4, 3, 2);
      blade_edge_4.setRotationPoint(-2F, -86F, -1F);
      blade_edge_4.setTextureSize(256, 128);
      blade_edge_4.mirror = true;
      setRotation(blade_edge_4, 0F, 0F, 0F);
      blade_edge_5 = new ModelRenderer(this, 167, 11);
      blade_edge_5.addBox(-3F, 0F, -5F, 4, 2, 2);
      blade_edge_5.setRotationPoint(1F, -83F, 1F);
      blade_edge_5.setTextureSize(256, 128);
      blade_edge_5.mirror = true;
      setRotation(blade_edge_5, 0F, 0F, 0F);
      blade_edge_6 = new ModelRenderer(this, 94, 17);
      blade_edge_6.addBox(-3F, 0F, 0F, 4, 4, 1);
      blade_edge_6.setRotationPoint(1F, -82F, -4F);
      blade_edge_6.setTextureSize(256, 128);
      blade_edge_6.mirror = true;
      setRotation(blade_edge_6, 0F, 0F, 0F);
      blade_edge_7 = new ModelRenderer(this, 181, 31);
      blade_edge_7.addBox(-3F, 0F, 0F, 6, 2, 2);
      blade_edge_7.setRotationPoint(0F, -40F, -6F);
      blade_edge_7.setTextureSize(256, 128);
      blade_edge_7.mirror = true;
      setRotation(blade_edge_7, 0F, 0F, 0F);
      blade_edge_8 = new ModelRenderer(this, 102, 23);
      blade_edge_8.addBox(-3F, 0F, 0F, 6, 11, 1);
      blade_edge_8.setRotationPoint(0F, -39F, -6F);
      blade_edge_8.setTextureSize(256, 128);
      blade_edge_8.mirror = true;
      setRotation(blade_edge_8, 0F, 0F, 0F);
      blade_edge_9 = new ModelRenderer(this, 89, 27);
      blade_edge_9.addBox(0F, 0F, 0F, 4, 2, 2);
      blade_edge_9.setRotationPoint(-2F, -36F, -9F);
      blade_edge_9.setTextureSize(256, 128);
      blade_edge_9.mirror = true;
      setRotation(blade_edge_9, 0F, 0F, 0F);
      blade_edge_10 = new ModelRenderer(this, 72, 28);
      blade_edge_10.addBox(0F, 0F, 0F, 6, 2, 1);
      blade_edge_10.setRotationPoint(-3F, -31F, -5F);
      blade_edge_10.setTextureSize(256, 128);
      blade_edge_10.mirror = true;
      setRotation(blade_edge_10, 0F, 0F, 0F);
      blade_edge_11 = new ModelRenderer(this, 239, 6);
      blade_edge_11.addBox(0F, 0F, 0F, 4, 10, 1);
      blade_edge_11.setRotationPoint(-2F, -50F, -9F);
      blade_edge_11.setTextureSize(256, 128);
      blade_edge_11.mirror = true;
      setRotation(blade_edge_11, 0F, 0F, 0F);
      blade_edge_12 = new ModelRenderer(this, 45, 21);
      blade_edge_12.addBox(0F, 0F, -7F, 4, 4, 1);
      blade_edge_12.setRotationPoint(-2F, -62F, 0F);
      blade_edge_12.setTextureSize(256, 128);
      blade_edge_12.mirror = true;
      setRotation(blade_edge_12, 0F, 0F, 0F);
      blade_edge_13 = new ModelRenderer(this, 120, 15);
      blade_edge_13.addBox(0F, 0F, 0F, 4, 4, 1);
      blade_edge_13.setRotationPoint(-2F, -74F, -5F);
      blade_edge_13.setTextureSize(256, 128);
      blade_edge_13.mirror = true;
      setRotation(blade_edge_13, 0F, 0F, 0F);
      blade_edge_14 = new ModelRenderer(this, 130, 4);
      blade_edge_14.addBox(-3F, 0F, 0F, 4, 2, 1);
      blade_edge_14.setRotationPoint(1F, -78F, -4F);
      blade_edge_14.setTextureSize(256, 128);
      blade_edge_14.mirror = true;
      setRotation(blade_edge_14, 0F, 0F, 0F);
      blade_edge_15 = new ModelRenderer(this, 150, 15);
      blade_edge_15.addBox(0F, 0F, 0F, 4, 5, 1);
      blade_edge_15.setRotationPoint(-2F, -79F, -11F);
      blade_edge_15.setTextureSize(256, 128);
      blade_edge_15.mirror = true;
      setRotation(blade_edge_15, 0F, 0F, 0F);
      blade_edge_16 = new ModelRenderer(this, 166, 16);
      blade_edge_16.addBox(0F, 0F, 0F, 4, 4, 1);
      blade_edge_16.setRotationPoint(-2F, -66F, -14F);
      blade_edge_16.setTextureSize(256, 128);
      blade_edge_16.mirror = true;
      setRotation(blade_edge_16, 0F, 0F, 0F);
      blade_edge_17 = new ModelRenderer(this, 239, 0);
      blade_edge_17.addBox(0F, 0F, 0F, 4, 4, 1);
      blade_edge_17.setRotationPoint(-2F, -54F, -16F);
      blade_edge_17.setTextureSize(256, 128);
      blade_edge_17.mirror = true;
      setRotation(blade_edge_17, 0F, 0F, 0F);
      blade_edge_18 = new ModelRenderer(this, 130, 0);
      blade_edge_18.addBox(-3F, 0F, 0F, 4, 2, 1);
      blade_edge_18.setRotationPoint(1F, -93F, -4F);
      blade_edge_18.setTextureSize(256, 128);
      blade_edge_18.mirror = true;
      setRotation(blade_edge_18, 0F, 0F, 0F);
      blade_edge_19 = new ModelRenderer(this, 132, 11);
      blade_edge_19.addBox(0F, 0F, 0F, 4, 2, 1);
      blade_edge_19.setRotationPoint(-2F, -85F, -9F);
      blade_edge_19.setTextureSize(256, 128);
      blade_edge_19.mirror = true;
      setRotation(blade_edge_19, 0F, 0F, 0F);
      blade_edge_20 = new ModelRenderer(this, 135, 15);
      blade_edge_20.addBox(-3F, 0F, 0F, 4, 2, 1);
      blade_edge_20.setRotationPoint(1F, -76F, -12F);
      blade_edge_20.setTextureSize(256, 128);
      blade_edge_20.mirror = true;
      setRotation(blade_edge_20, 0F, 0F, 0F);
      blade_edge_21 = new ModelRenderer(this, 168, 0);
      blade_edge_21.addBox(-3F, 0F, 0F, 4, 2, 2);
      blade_edge_21.setRotationPoint(1F, -88F, -7F);
      blade_edge_21.setTextureSize(256, 128);
      blade_edge_21.mirror = true;
      setRotation(blade_edge_21, 0F, 0F, 0F);
      blade_hook_edge_base_2 = new ModelRenderer(this, 70, 58);
      blade_hook_edge_base_2.addBox(0F, -15F, 0F, 8, 3, 3);
      blade_hook_edge_base_2.setRotationPoint(-4F, 0F, -7F);
      blade_hook_edge_base_2.setTextureSize(256, 128);
      blade_hook_edge_base_2.mirror = true;
      setRotation(blade_hook_edge_base_2, 0F, 0F, 0F);
      blade_hook_edge_base_1 = new ModelRenderer(this, 70, 47);
      blade_hook_edge_base_1.addBox(-2F, -6F, -9F, 8, 3, 3);
      blade_hook_edge_base_1.setRotationPoint(-2F, -8F, 0F);
      blade_hook_edge_base_1.setTextureSize(256, 128);
      blade_hook_edge_base_1.mirror = true;
      setRotation(blade_hook_edge_base_1, 0F, 0F, 0F);
      blade_hook_edge_base_3 = new ModelRenderer(this, 93, 58);
      blade_hook_edge_base_3.addBox(-2F, 0F, -11F, 8, 3, 3);
      blade_hook_edge_base_3.setRotationPoint(-2F, -13F, 0F);
      blade_hook_edge_base_3.setTextureSize(256, 128);
      blade_hook_edge_base_3.mirror = true;
      setRotation(blade_hook_edge_base_3, 0F, 0F, 0F);
      blade_hook_edge_base_4 = new ModelRenderer(this, 70, 54);
      blade_hook_edge_base_4.addBox(-3F, -6F, -2F, 8, 2, 1);
      blade_hook_edge_base_4.setRotationPoint(-1F, -10F, -6F);
      blade_hook_edge_base_4.setTextureSize(256, 128);
      blade_hook_edge_base_4.mirror = true;
      setRotation(blade_hook_edge_base_4, 0F, 0F, 0F);
      blade_hook_edge_base_5 = new ModelRenderer(this, 93, 50);
      blade_hook_edge_base_5.addBox(-5F, -3F, -13F, 8, 2, 2);
      blade_hook_edge_base_5.setRotationPoint(1F, -9F, 0F);
      blade_hook_edge_base_5.setTextureSize(256, 128);
      blade_hook_edge_base_5.mirror = true;
      setRotation(blade_hook_edge_base_5, 0F, 0F, 0F);
      blade_hook_edge_base_6 = new ModelRenderer(this, 70, 44);
      blade_hook_edge_base_6.addBox(0F, -12F, -6F, 8, 1, 1);
      blade_hook_edge_base_6.setRotationPoint(-4F, 0F, 0F);
      blade_hook_edge_base_6.setTextureSize(256, 128);
      blade_hook_edge_base_6.mirror = true;
      setRotation(blade_hook_edge_base_6, 0F, 0F, 0F);
      blade_hook_edge_base_7 = new ModelRenderer(this, 93, 55);
      blade_hook_edge_base_7.addBox(1F, -11F, -8F, 8, 1, 1);
      blade_hook_edge_base_7.setRotationPoint(-5F, 0F, 0F);
      blade_hook_edge_base_7.setTextureSize(256, 128);
      blade_hook_edge_base_7.mirror = true;
      setRotation(blade_hook_edge_base_7, 0F, 0F, 0F);
      blade_hook_edge_base_8 = new ModelRenderer(this, 93, 46);
      blade_hook_edge_base_8.addBox(-3F, -11F, -14F, 8, 1, 2);
      blade_hook_edge_base_8.setRotationPoint(-1F, 0F, 0F);
      blade_hook_edge_base_8.setTextureSize(256, 128);
      blade_hook_edge_base_8.mirror = true;
      setRotation(blade_hook_edge_base_8, 0F, 0F, 0F);
      blade_2_hook_edge_base_1 = new ModelRenderer(this, 120, 54);
      blade_2_hook_edge_base_1.addBox(-4F, -23F, -16F, 8, 5, 5);
      blade_2_hook_edge_base_1.setRotationPoint(0F, 0F, 0F);
      blade_2_hook_edge_base_1.setTextureSize(256, 128);
      blade_2_hook_edge_base_1.mirror = true;
      setRotation(blade_2_hook_edge_base_1, 0F, 0F, 0F);
      blade_2_hook_edge_base_2 = new ModelRenderer(this, 120, 44);
      blade_2_hook_edge_base_2.addBox(0F, -22F, -18F, 8, 5, 4);
      blade_2_hook_edge_base_2.setRotationPoint(-4F, 0F, 0F);
      blade_2_hook_edge_base_2.setTextureSize(256, 128);
      blade_2_hook_edge_base_2.mirror = true;
      setRotation(blade_2_hook_edge_base_2, 0F, 0F, 0F);
      blade_2_hook_edge_base_3 = new ModelRenderer(this, 147, 57);
      blade_2_hook_edge_base_3.addBox(0F, -21F, -22F, 8, 3, 4);
      blade_2_hook_edge_base_3.setRotationPoint(-4F, 0F, 0F);
      blade_2_hook_edge_base_3.setTextureSize(256, 128);
      blade_2_hook_edge_base_3.mirror = true;
      setRotation(blade_2_hook_edge_base_3, 0F, 0F, 0F);
      blade_2_hook_edge_base_4 = new ModelRenderer(this, 147, 53);
      blade_2_hook_edge_base_4.addBox(0F, -21F, -23F, 8, 2, 1);
      blade_2_hook_edge_base_4.setRotationPoint(-4F, 0F, 0F);
      blade_2_hook_edge_base_4.setTextureSize(256, 128);
      blade_2_hook_edge_base_4.mirror = true;
      setRotation(blade_2_hook_edge_base_4, 0F, 0F, 0F);
      blade_edge_22 = new ModelRenderer(this, 115, 5);
      blade_edge_22.addBox(-10F, 0F, 0F, 4, 2, 1);
      blade_edge_22.setRotationPoint(8F, -91F, 1F);
      blade_edge_22.setTextureSize(256, 128);
      blade_edge_22.mirror = true;
      setRotation(blade_edge_22, 0F, 0F, 0F);
      blade_edge_23 = new ModelRenderer(this, 75, 0);
      blade_edge_23.addBox(0F, 0F, 0F, 4, 2, 1);
      blade_edge_23.setRotationPoint(-2F, -105F, 2F);
      blade_edge_23.setTextureSize(256, 128);
      blade_edge_23.mirror = true;
      setRotation(blade_edge_23, 0F, 0F, 0F);
      blade_edge_24 = new ModelRenderer(this, 147, 11);
      blade_edge_24.addBox(0F, 0F, 0F, 4, 2, 1);
      blade_edge_24.setRotationPoint(-2F, -90F, -6F);
      blade_edge_24.setTextureSize(256, 128);
      blade_edge_24.mirror = true;
      setRotation(blade_edge_24, 0F, 0F, 0F);
      blade_edge_25 = new ModelRenderer(this, 94, 14);
      blade_edge_25.addBox(1F, 0F, 0F, 4, 1, 1);
      blade_edge_25.setRotationPoint(-3F, -96F, -2F);
      blade_edge_25.setTextureSize(256, 128);
      blade_edge_25.mirror = true;
      setRotation(blade_edge_25, 0F, 0F, 0F);
      blade_hook_4_1 = new ModelRenderer(this, 173, 57);
      blade_hook_4_1.addBox(0F, 0F, 0F, 8, 3, 4);
      blade_hook_4_1.setRotationPoint(-4F, -31F, -19F);
      blade_hook_4_1.setTextureSize(256, 128);
      blade_hook_4_1.mirror = true;
      setRotation(blade_hook_4_1, 0F, 0F, 0F);
      ablade_hook_4_1 = new ModelRenderer(this, 173, 49);
      ablade_hook_4_1.addBox(3F, -32F, -22F, 8, 3, 4);
      ablade_hook_4_1.setRotationPoint(-7F, 0F, 0F);
      ablade_hook_4_1.setTextureSize(256, 128);
      ablade_hook_4_1.mirror = true;
      setRotation(ablade_hook_4_1, 0F, 0F, 0F);
      blade_hilt_edge_1 = new ModelRenderer(this, 1, 17);
      blade_hilt_edge_1.addBox(0F, 0F, 0F, 10, 1, 2);
      blade_hilt_edge_1.setRotationPoint(-5F, 20F, 5F);
      blade_hilt_edge_1.setTextureSize(256, 128);
      blade_hilt_edge_1.mirror = true;
      setRotation(blade_hilt_edge_1, 0F, 0F, 0F);
      blade_hilt_edge_2 = new ModelRenderer(this, 1, 22);
      blade_hilt_edge_2.addBox(0F, 0F, 0F, 10, 1, 2);
      blade_hilt_edge_2.setRotationPoint(-5F, 20F, -7F);
      blade_hilt_edge_2.setTextureSize(256, 128);
      blade_hilt_edge_2.mirror = true;
      setRotation(blade_hilt_edge_2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    hilt.render(f5);
    base_hilt_top.render(f5);
    top_hilt_1.render(f5);
    top_hilt_2.render(f5);
    main_base_1.render(f5);
    main_base_2.render(f5);
    main_base_3.render(f5);
    main_base_4.render(f5);
    main_base_5.render(f5);
    small_blade_part_1.render(f5);
    small_blade_part_2.render(f5);
    small_blade_part.render(f5);
    main_base_6.render(f5);
    main_base_7.render(f5);
    main_base_8.render(f5);
    main_base_9.render(f5);
    main_base_10.render(f5);
    main_base_11.render(f5);
    main_base_12.render(f5);
    main_base_13.render(f5);
    main_base_14.render(f5);
    main_base_15.render(f5);
    hook_blade_2_part_1.render(f5);
    hook_blade_2_part_2.render(f5);
    main_base_16.render(f5);
    main_base_17.render(f5);
    small_blade_part_3.render(f5);
    main_base_18.render(f5);
    main_base_19.render(f5);
    main_base_20.render(f5);
    hook_blade_2_part_3.render(f5);
    hook_blade_2_part_4.render(f5);
    hook_blade_2_part_5.render(f5);
    hook_blade_1_part_1.render(f5);
    hook_blade_1_part_2.render(f5);
    hook_blade_1_part_3.render(f5);
    main_base_21.render(f5);
    main_base_22.render(f5);
    main_base_23.render(f5);
    main_blade_frame_1.render(f5);
    main_blade_frame_2.render(f5);
    main_blade_asset_1.render(f5);
    main_blade_frame_3.render(f5);
    main_blade_frame_4.render(f5);
    main_blade_frame_5.render(f5);
    main_blade_frame_6.render(f5);
    main_blade_frame_7.render(f5);
    main_blade_frame_8.render(f5);
    blade_top_1.render(f5);
    blade_edge_1.render(f5);
    blade_top_2.render(f5);
    blade_edge_2.render(f5);
    blade_edge_3.render(f5);
    blade_edge_4.render(f5);
    blade_edge_5.render(f5);
    blade_edge_6.render(f5);
    blade_edge_7.render(f5);
    blade_edge_8.render(f5);
    blade_edge_9.render(f5);
    blade_edge_10.render(f5);
    blade_edge_11.render(f5);
    blade_edge_12.render(f5);
    blade_edge_13.render(f5);
    blade_edge_14.render(f5);
    blade_edge_15.render(f5);
    blade_edge_16.render(f5);
    blade_edge_17.render(f5);
    blade_edge_18.render(f5);
    blade_edge_19.render(f5);
    blade_edge_20.render(f5);
    blade_edge_21.render(f5);
    blade_hook_edge_base_2.render(f5);
    blade_hook_edge_base_1.render(f5);
    blade_hook_edge_base_3.render(f5);
    blade_hook_edge_base_4.render(f5);
    blade_hook_edge_base_5.render(f5);
    blade_hook_edge_base_6.render(f5);
    blade_hook_edge_base_7.render(f5);
    blade_hook_edge_base_8.render(f5);
    blade_2_hook_edge_base_1.render(f5);
    blade_2_hook_edge_base_2.render(f5);
    blade_2_hook_edge_base_3.render(f5);
    blade_2_hook_edge_base_4.render(f5);
    blade_edge_22.render(f5);
    blade_edge_23.render(f5);
    blade_edge_24.render(f5);
    blade_edge_25.render(f5);
    blade_hook_4_1.render(f5);
    ablade_hook_4_1.render(f5);
    blade_hilt_edge_1.render(f5);
    blade_hilt_edge_2.render(f5);
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
