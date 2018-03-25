package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSergeantSteelWill extends ModelBase
{
  //fields
    ModelRenderer Footleft;
    ModelRenderer FootRight;
    ModelRenderer LegBottomRight;
    ModelRenderer LegBottomLeft;
    ModelRenderer LegTopRight;
    ModelRenderer LegTopLeft;
    ModelRenderer LowerTorso;
    ModelRenderer UpperTorso;
    ModelRenderer PeckLeft;
    ModelRenderer PeckRight;
    ModelRenderer ShoulderRight;
    ModelRenderer UpperArmRight;
    ModelRenderer LowerArmRight;
    ModelRenderer HandRight;
    ModelRenderer FingerRight1;
    ModelRenderer FingeRight2;
    ModelRenderer FingerRight3;
    ModelRenderer Thumb;
    ModelRenderer ShoulderLeft;
    ModelRenderer UpperArmLeft;
    ModelRenderer LowerArmLeft;
    ModelRenderer HandLeft;
    ModelRenderer FingerLeft1;
    ModelRenderer FingerLeft3;
    ModelRenderer Fingerleft2;
    ModelRenderer FingerLeft3Part1;
    ModelRenderer FingerLeft2Part1;
    ModelRenderer FingerLeft1Part1;
    ModelRenderer ThumbLeft;
    ModelRenderer ThumbLeftPart;
    ModelRenderer Neck;
    ModelRenderer Skull;
    ModelRenderer Chin;
    ModelRenderer ChinTip;
    ModelRenderer BeardPointRight;
    ModelRenderer BeardPointLeft;
    ModelRenderer Hair;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Hair5;
    ModelRenderer Hair6;
    ModelRenderer ShoulderGuardRightTop;
    ModelRenderer ShoulderGuardRightFront;
    ModelRenderer ShoulderGuardRightBack;
    ModelRenderer ShoulderGuardLeftTop;
    ModelRenderer ShoulderGuardLeftFront;
    ModelRenderer ShoudlerGuardLeftBack;
    ModelRenderer Braclet;
    ModelRenderer EarRight;
    ModelRenderer EarLeft;
    ModelRenderer Nose;
    ModelRenderer Spike1;
    ModelRenderer Spike2;
    ModelRenderer Spike3;
    ModelRenderer Spike4;
    ModelRenderer Spike5;
    ModelRenderer Spike6;
    ModelRenderer BootTop;
    ModelRenderer BootTop2;
    ModelRenderer FlailHandle;
    ModelRenderer FlailTip;
    ModelRenderer FlailChain1;
    ModelRenderer FlaillChain2;
    ModelRenderer FlailChain3;
    ModelRenderer FlailChain4;
    ModelRenderer FlailChain;
    ModelRenderer FlailBody;
    ModelRenderer FlailPoint1;
    ModelRenderer FlailPoint2;
    ModelRenderer FlailPoint3;
    ModelRenderer FlailPoint4;
    ModelRenderer FlailTip1;
    ModelRenderer FlailTip2;
    ModelRenderer FlailTip3;
    ModelRenderer FlailTip4;
  
  public ModelSergeantSteelWill()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Footleft = new ModelRenderer(this, 97, 51);
      Footleft.addBox(0F, 0F, 0F, 5, 3, 10);
      Footleft.setRotationPoint(-6F, 21F, -3F);
      Footleft.setTextureSize(128, 64);
      Footleft.mirror = true;
      setRotation(Footleft, 0F, 0F, 0F);
      FootRight = new ModelRenderer(this, 97, 51);
      FootRight.addBox(0F, 0F, 0F, 5, 3, 10);
      FootRight.setRotationPoint(1F, 21F, -3F);
      FootRight.setTextureSize(128, 64);
      FootRight.mirror = true;
      setRotation(FootRight, 0F, 0F, 0F);
      LegBottomRight = new ModelRenderer(this, 95, 35);
      LegBottomRight.addBox(0F, 0F, 0F, 4, 12, 4);
      LegBottomRight.setRotationPoint(1.5F, 10.9F, 0.8F);
      LegBottomRight.setTextureSize(128, 64);
      LegBottomRight.mirror = true;
      setRotation(LegBottomRight, 0.1745329F, 0F, 0F);
      LegBottomLeft = new ModelRenderer(this, 95, 35);
      LegBottomLeft.addBox(0F, 0F, 0F, 4, 12, 4);
      LegBottomLeft.setRotationPoint(-5.5F, 10.9F, 0.8F);
      LegBottomLeft.setTextureSize(128, 64);
      LegBottomLeft.mirror = true;
      setRotation(LegBottomLeft, 0.1745329F, 0F, 0F);
      LegTopRight = new ModelRenderer(this, 112, 36);
      LegTopRight.addBox(0F, 0F, 0F, 4, 11, 4);
      LegTopRight.setRotationPoint(1.5F, 0F, 1.6F);
      LegTopRight.setTextureSize(128, 64);
      LegTopRight.mirror = true;
      setRotation(LegTopRight, -0.0872665F, 0F, 0F);
      LegTopLeft = new ModelRenderer(this, 112, 36);
      LegTopLeft.addBox(0F, 0F, 0F, 4, 11, 4);
      LegTopLeft.setRotationPoint(-5.5F, 0F, 1.5F);
      LegTopLeft.setTextureSize(128, 64);
      LegTopLeft.mirror = true;
      setRotation(LegTopLeft, -0.0698132F, 0F, 0F);
      LowerTorso = new ModelRenderer(this, 94, 16);
      LowerTorso.addBox(0F, 0F, 0F, 12, 13, 5);
      LowerTorso.setRotationPoint(-6F, -12F, 1F);
      LowerTorso.setTextureSize(128, 64);
      LowerTorso.mirror = true;
      setRotation(LowerTorso, 0F, 0F, 0F);
      UpperTorso = new ModelRenderer(this, 81, 0);
      UpperTorso.addBox(0F, 0F, 0F, 17, 9, 7);
      UpperTorso.setRotationPoint(-8.5F, -21F, 0F);
      UpperTorso.setTextureSize(128, 64);
      UpperTorso.mirror = true;
      setRotation(UpperTorso, 0F, 0F, 0F);
      PeckLeft = new ModelRenderer(this, 62, 0);
      PeckLeft.addBox(0F, 0F, 0F, 8, 9, 1);
      PeckLeft.setRotationPoint(-8.5F, -21F, 0F);
      PeckLeft.setTextureSize(128, 64);
      PeckLeft.mirror = true;
      setRotation(PeckLeft, 0F, 0.0383972F, 0F);
      PeckRight = new ModelRenderer(this, 62, 11);
      PeckRight.addBox(0F, 0F, 0F, 8, 9, 1);
      PeckRight.setRotationPoint(0.5F, -21F, -0.3F);
      PeckRight.setTextureSize(128, 64);
      PeckRight.mirror = true;
      setRotation(PeckRight, 0F, -0.0383972F, 0F);
      ShoulderRight = new ModelRenderer(this, 0, 41);
      ShoulderRight.addBox(0F, 0F, 0F, 5, 5, 6);
      ShoulderRight.setRotationPoint(8.3F, -20.7F, 0.5F);
      ShoulderRight.setTextureSize(128, 64);
      ShoulderRight.mirror = true;
      setRotation(ShoulderRight, 0F, 0F, 0F);
      UpperArmRight = new ModelRenderer(this, 0, 37);
      UpperArmRight.addBox(0F, 0F, 0F, 4, 10, 5);
      UpperArmRight.setRotationPoint(9F, -16F, 1F);
      UpperArmRight.setTextureSize(128, 64);
      UpperArmRight.mirror = true;
      setRotation(UpperArmRight, 0F, 0F, 0F);
      LowerArmRight = new ModelRenderer(this, 0, 39);
      LowerArmRight.addBox(0F, 0F, 0F, 3, 9, 4);
      LowerArmRight.setRotationPoint(9.5F, -6.5F, 1.5F);
      LowerArmRight.setTextureSize(128, 64);
      LowerArmRight.mirror = true;
      setRotation(LowerArmRight, 0F, 0F, 0F);
      HandRight = new ModelRenderer(this, 0, 52);
      HandRight.addBox(0F, 0F, 0F, 2, 4, 3);
      HandRight.setRotationPoint(10.3F, 2F, 2F);
      HandRight.setTextureSize(128, 64);
      HandRight.mirror = true;
      setRotation(HandRight, 0F, 0F, 0F);
      FingerRight1 = new ModelRenderer(this, 5, 59);
      FingerRight1.addBox(0F, 0F, 0F, 1, 4, 1);
      FingerRight1.setRotationPoint(11.2F, 5.8F, 1.9F);
      FingerRight1.setTextureSize(128, 64);
      FingerRight1.mirror = true;
      setRotation(FingerRight1, 0F, 0F, 0.2094395F);
      FingeRight2 = new ModelRenderer(this, 5, 59);
      FingeRight2.addBox(0F, 0F, 0F, 1, 4, 1);
      FingeRight2.setRotationPoint(11.2F, 5.8F, 3F);
      FingeRight2.setTextureSize(128, 64);
      FingeRight2.mirror = true;
      setRotation(FingeRight2, 0F, 0F, 0.2094395F);
      FingerRight3 = new ModelRenderer(this, 5, 59);
      FingerRight3.addBox(0F, 0F, 0F, 1, 4, 1);
      FingerRight3.setRotationPoint(11.2F, 5.8F, 4.1F);
      FingerRight3.setTextureSize(128, 64);
      FingerRight3.mirror = true;
      setRotation(FingerRight3, 0F, 0F, 0.2094395F);
      Thumb = new ModelRenderer(this, 0, 60);
      Thumb.addBox(0F, 0F, 0F, 1, 3, 1);
      Thumb.setRotationPoint(10.3F, 4F, 2F);
      Thumb.setTextureSize(128, 64);
      Thumb.mirror = true;
      setRotation(Thumb, 0.1919862F, 0F, 0.6981317F);
      ShoulderLeft = new ModelRenderer(this, 0, 41);
      ShoulderLeft.addBox(0F, 0F, 0F, 5, 5, 6);
      ShoulderLeft.setRotationPoint(-13.4F, -20.7F, 0.5F);
      ShoulderLeft.setTextureSize(128, 64);
      ShoulderLeft.mirror = true;
      setRotation(ShoulderLeft, 0F, 0F, 0F);
      UpperArmLeft = new ModelRenderer(this, 0, 37);
      UpperArmLeft.addBox(0F, 0F, 0F, 4, 10, 5);
      UpperArmLeft.setRotationPoint(-13F, -16F, 1F);
      UpperArmLeft.setTextureSize(128, 64);
      UpperArmLeft.mirror = true;
      setRotation(UpperArmLeft, 0.0872665F, 0F, 0F);
      LowerArmLeft = new ModelRenderer(this, 0, 39);
      LowerArmLeft.addBox(0F, 0F, 0F, 3, 9, 4);
      LowerArmLeft.setRotationPoint(-12.5F, -7.1F, 2.5F);
      LowerArmLeft.setTextureSize(128, 64);
      LowerArmLeft.mirror = true;
      setRotation(LowerArmLeft, -0.1745329F, 0F, 0F);
      HandLeft = new ModelRenderer(this, 0, 52);
      HandLeft.addBox(0F, 0F, 0F, 2, 4, 3);
      HandLeft.setRotationPoint(-12.3F, 0.3F, 1.5F);
      HandLeft.setTextureSize(128, 64);
      HandLeft.mirror = true;
      setRotation(HandRight, -0.6981317F, 0F, 0F);
      FingerLeft1 = new ModelRenderer(this, 10, 61);
      FingerLeft1.addBox(0F, 0F, 0F, 1, 2, 1);
      FingerLeft1.setRotationPoint(-12.2F, 3.2F, -1F);
      FingerLeft1.setTextureSize(128, 64);
      FingerLeft1.mirror = true;
      setRotation(FingerLeft1, -0.7330383F, -0.296706F, -0.296706F);
      FingerLeft3 = new ModelRenderer(this, 10, 61);
      FingerLeft3.addBox(0F, 0F, 0F, 1, 2, 1);
      FingerLeft3.setRotationPoint(-12.2F, 4.6F, 0.6F);
      FingerLeft3.setTextureSize(128, 64);
      FingerLeft3.mirror = true;
      setRotation(FingerLeft3, -0.7330383F, -0.296706F, -0.296706F);
      Fingerleft2 = new ModelRenderer(this, 10, 61);
      Fingerleft2.addBox(0F, 0F, 0F, 1, 2, 1);
      Fingerleft2.setRotationPoint(-12.2F, 3.9F, -0.2F);
      Fingerleft2.setTextureSize(128, 64);
      Fingerleft2.mirror = true;
      setRotation(Fingerleft2, -0.7330383F, -0.296706F, -0.296706F);
      FingerLeft3Part1 = new ModelRenderer(this, 14, 61);
      FingerLeft3Part1.addBox(0F, 0F, 0F, 1, 2, 1);
      FingerLeft3Part1.setRotationPoint(-11.4F, 6F, -0.5F);
      FingerLeft3Part1.setTextureSize(128, 64);
      FingerLeft3Part1.mirror = true;
      setRotation(FingerLeft3Part1, -1.012291F, -0.8552113F, -0.7504916F);
      FingerLeft2Part1 = new ModelRenderer(this, 14, 61);
      FingerLeft2Part1.addBox(0F, 0F, 0F, 1, 2, 1);
      FingerLeft2Part1.setRotationPoint(-11.4F, 5.4F, -1.4F);
      FingerLeft2Part1.setTextureSize(128, 64);
      FingerLeft2Part1.mirror = true;
      setRotation(FingerLeft2Part1, -1.012291F, -0.8726646F, -0.7853982F);
      FingerLeft1Part1 = new ModelRenderer(this, 14, 61);
      FingerLeft1Part1.addBox(0F, 0F, 0F, 1, 2, 1);
      FingerLeft1Part1.setRotationPoint(-11.4F, 4.7F, -2.2F);
      FingerLeft1Part1.setTextureSize(128, 64);
      FingerLeft1Part1.mirror = true;
      setRotation(FingerLeft1Part1, -1.012291F, -0.8726646F, -0.7679449F);
      ThumbLeft = new ModelRenderer(this, 14, 61);
      ThumbLeft.addBox(0F, 0F, 0F, 1, 2, 1);
      ThumbLeft.setRotationPoint(-11.9F, 2F, 0F);
      ThumbLeft.setTextureSize(128, 64);
      ThumbLeft.mirror = true;
      setRotation(ThumbLeft, -1.658063F, -0.7504916F, 0F);
      ThumbLeftPart = new ModelRenderer(this, 14, 61);
      ThumbLeftPart.addBox(0F, 0F, 0F, 1, 2, 1);
      ThumbLeftPart.setRotationPoint(-10.6F, 2.8F, -1.4F);
      ThumbLeftPart.setTextureSize(128, 64);
      ThumbLeftPart.mirror = true;
      setRotation(ThumbLeftPart, -0.6632251F, -0.4886922F, -1.27409F);
      Neck = new ModelRenderer(this, 72, 57);
      Neck.addBox(0F, 0F, 0F, 4, 2, 4);
      Neck.setRotationPoint(-2F, -22.8F, 1.5F);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Skull = new ModelRenderer(this, 68, 44);
      Skull.addBox(0F, 0F, 0F, 7, 7, 5);
      Skull.setRotationPoint(-3.5F, -29.66667F, 1F);
      Skull.setTextureSize(128, 64);
      Skull.mirror = true;
      setRotation(Skull, 0F, 0F, 0F);
      Chin = new ModelRenderer(this, 61, 57);
      Chin.addBox(0F, 0F, 0F, 4, 2, 1);
      Chin.setRotationPoint(-2F, -24F, 1F);
      Chin.setTextureSize(128, 64);
      Chin.mirror = true;
      setRotation(Chin, -0.6632251F, 0F, 0F);
      ChinTip = new ModelRenderer(this, 65, 60);
      ChinTip.addBox(0F, 0F, 0F, 2, 1, 1);
      ChinTip.setRotationPoint(-1F, -22.6F, -0.1F);
      ChinTip.setTextureSize(128, 64);
      ChinTip.mirror = true;
      setRotation(ChinTip, -0.6632251F, 0F, 0F);
      BeardPointRight = new ModelRenderer(this, 60, 60);
      BeardPointRight.addBox(0F, 0F, 0F, 1, 3, 1);
      BeardPointRight.setRotationPoint(0F, -22F, -0.6F);
      BeardPointRight.setTextureSize(128, 64);
      BeardPointRight.mirror = true;
      setRotation(BeardPointRight, -0.5934119F, -0.1396263F, -0.1745329F);
      BeardPointLeft = new ModelRenderer(this, 60, 60);
      BeardPointLeft.addBox(0F, 0F, 0F, 1, 3, 1);
      BeardPointLeft.setRotationPoint(-1F, -22.2F, -0.5F);
      BeardPointLeft.setTextureSize(128, 64);
      BeardPointLeft.mirror = true;
      setRotation(BeardPointLeft, -0.5934119F, 0.1396263F, 0.1745329F);
      Hair = new ModelRenderer(this, 36, 55);
      Hair.addBox(0F, 0F, 0F, 2, 3, 6);
      Hair.setRotationPoint(-1F, -32F, 0.5F);
      Hair.setTextureSize(128, 64);
      Hair.mirror = true;
      setRotation(Hair, 0F, 0F, 0F);
      Hair2 = new ModelRenderer(this, 46, 49);
      Hair2.addBox(0F, 0F, 0F, 2, 1, 1);
      Hair2.setRotationPoint(-1F, -29.8F, 0.5F);
      Hair2.setTextureSize(128, 64);
      Hair2.mirror = true;
      setRotation(Hair2, 0F, 0F, 0F);
      Hair3 = new ModelRenderer(this, 46, 48);
      Hair3.addBox(0F, 0F, 0F, 2, 1, 1);
      Hair3.setRotationPoint(-1F, -29.8F, 5.5F);
      Hair3.setTextureSize(128, 64);
      Hair3.mirror = true;
      setRotation(Hair3, 0F, 0F, 0F);
      Hair4 = new ModelRenderer(this, 46, 51);
      Hair4.addBox(0F, 0F, 0F, 2, 3, 1);
      Hair4.setRotationPoint(-1F, -33F, 1F);
      Hair4.setTextureSize(128, 64);
      Hair4.mirror = true;
      setRotation(Hair4, -0.837758F, 0F, 0F);
      Hair5 = new ModelRenderer(this, 31, 48);
      Hair5.addBox(0F, 0F, 0F, 2, 2, 5);
      Hair5.setRotationPoint(-1F, -33F, 1F);
      Hair5.setTextureSize(128, 64);
      Hair5.mirror = true;
      setRotation(Hair5, 0F, 0F, 0F);
      Hair6 = new ModelRenderer(this, 46, 51);
      Hair6.addBox(0F, 0F, 0F, 2, 3, 1);
      Hair6.setRotationPoint(-1F, -32.3F, 5.3F);
      Hair6.setTextureSize(128, 64);
      Hair6.mirror = true;
      setRotation(Hair6, 0.837758F, 0F, 0F);
      ShoulderGuardRightTop = new ModelRenderer(this, 60, 32);
      ShoulderGuardRightTop.addBox(0F, 0F, 0F, 7, 2, 9);
      ShoulderGuardRightTop.setRotationPoint(7F, -23F, -1F);
      ShoulderGuardRightTop.setTextureSize(128, 64);
      ShoulderGuardRightTop.mirror = true;
      setRotation(ShoulderGuardRightTop, 0F, 0F, 0F);
      ShoulderGuardRightFront = new ModelRenderer(this, 60, 32);
      ShoulderGuardRightFront.addBox(0F, 0F, 0F, 7, 7, 1);
      ShoulderGuardRightFront.setRotationPoint(7F, -22F, -1F);
      ShoulderGuardRightFront.setTextureSize(128, 64);
      ShoulderGuardRightFront.mirror = true;
      setRotation(ShoulderGuardRightFront, 0F, 0F, 0F);
      ShoulderGuardRightBack = new ModelRenderer(this, 60, 32);
      ShoulderGuardRightBack.addBox(0F, 0F, 0F, 7, 7, 1);
      ShoulderGuardRightBack.setRotationPoint(7F, -22F, 7F);
      ShoulderGuardRightBack.setTextureSize(128, 64);
      ShoulderGuardRightBack.mirror = true;
      setRotation(ShoulderGuardRightBack, 0F, 0F, 0F);
      ShoulderGuardLeftTop = new ModelRenderer(this, 60, 32);
      ShoulderGuardLeftTop.addBox(0F, 0F, 0F, 7, 2, 9);
      ShoulderGuardLeftTop.setRotationPoint(-14F, -23F, -1F);
      ShoulderGuardLeftTop.setTextureSize(128, 64);
      ShoulderGuardLeftTop.mirror = true;
      setRotation(ShoulderGuardLeftTop, 0F, 0F, 0F);
      ShoulderGuardLeftFront = new ModelRenderer(this, 60, 32);
      ShoulderGuardLeftFront.addBox(0F, 0F, 0F, 7, 7, 1);
      ShoulderGuardLeftFront.setRotationPoint(-14F, -22F, -1F);
      ShoulderGuardLeftFront.setTextureSize(128, 64);
      ShoulderGuardLeftFront.mirror = true;
      setRotation(ShoulderGuardLeftFront, 0F, 0F, 0F);
      ShoudlerGuardLeftBack = new ModelRenderer(this, 60, 32);
      ShoudlerGuardLeftBack.addBox(0F, 0F, 0F, 7, 7, 1);
      ShoudlerGuardLeftBack.setRotationPoint(-14F, -22F, 7F);
      ShoudlerGuardLeftBack.setTextureSize(128, 64);
      ShoudlerGuardLeftBack.mirror = true;
      setRotation(ShoudlerGuardLeftBack, 0F, 0F, 0F);
      Braclet = new ModelRenderer(this, 74, 22);
      Braclet.addBox(0F, 0F, 0F, 4, 4, 5);
      Braclet.setRotationPoint(-13F, -2.8F, 1.3F);
      Braclet.setTextureSize(128, 64);
      Braclet.mirror = true;
      setRotation(Braclet, -0.1745329F, 0F, 0F);
      EarRight = new ModelRenderer(this, 53, 0);
      EarRight.addBox(0F, 0F, 0F, 3, 1, 1);
      EarRight.setRotationPoint(3F, -27.5F, 2.5F);
      EarRight.setTextureSize(128, 64);
      EarRight.mirror = true;
      setRotation(EarRight, 0F, -0.4537856F, -0.1745329F);
      EarLeft = new ModelRenderer(this, 54, 0);
      EarLeft.addBox(0F, 0F, 0F, 3, 1, 1);
      EarLeft.setRotationPoint(-6F, -28F, 4F);
      EarLeft.setTextureSize(128, 64);
      EarLeft.mirror = true;
      setRotation(EarLeft, 0F, 0.4537856F, 0.1745329F);
      Nose = new ModelRenderer(this, 57, 2);
      Nose.addBox(0F, 0F, 0F, 1, 2, 1);
      Nose.setRotationPoint(-0.5F, -26F, 1F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, -1.082104F, 0F, 0F);
      Spike1 = new ModelRenderer(this, 54, 30);
      Spike1.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike1.setRotationPoint(4.7F, 20F, -2F);
      Spike1.setTextureSize(128, 64);
      Spike1.mirror = true;
      setRotation(Spike1, 0F, 0F, 0F);
      Spike2 = new ModelRenderer(this, 54, 30);
      Spike2.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike2.setRotationPoint(3.1F, 20F, -2F);
      Spike2.setTextureSize(128, 64);
      Spike2.mirror = true;
      setRotation(Spike2, 0F, 0F, 0F);
      Spike3 = new ModelRenderer(this, 54, 30);
      Spike3.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike3.setRotationPoint(1.4F, 20F, -2F);
      Spike3.setTextureSize(128, 64);
      Spike3.mirror = true;
      setRotation(Spike3, 0F, 0F, 0F);
      Spike4 = new ModelRenderer(this, 54, 30);
      Spike4.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike4.setRotationPoint(-2.3F, 20F, -2F);
      Spike4.setTextureSize(128, 64);
      Spike4.mirror = true;
      setRotation(Spike4, 0F, 0F, 0F);
      Spike5 = new ModelRenderer(this, 54, 30);
      Spike5.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike5.setRotationPoint(-4F, 20F, -2F);
      Spike5.setTextureSize(128, 64);
      Spike5.mirror = true;
      setRotation(Spike5, 0F, 0F, 0F);
      Spike6 = new ModelRenderer(this, 54, 30);
      Spike6.addBox(0F, 0F, 0F, 1, 1, 1);
      Spike6.setRotationPoint(-5.7F, 20F, -2F);
      Spike6.setTextureSize(128, 64);
      Spike6.mirror = true;
      setRotation(Spike6, 0F, 0F, 0F);
      BootTop = new ModelRenderer(this, 38, 33);
      BootTop.addBox(0F, 0F, 0F, 5, 8, 5);
      BootTop.setRotationPoint(1F, 14.3F, 0.7F);
      BootTop.setTextureSize(128, 64);
      BootTop.mirror = true;
      setRotation(BootTop, 0.1745329F, 0F, 0F);
      BootTop2 = new ModelRenderer(this, 38, 33);
      BootTop2.addBox(0F, 0F, 0F, 5, 8, 5);
      BootTop2.setRotationPoint(-6F, 14.3F, 0.7F);
      BootTop2.setTextureSize(128, 64);
      BootTop2.mirror = true;
      setRotation(BootTop2, 0.1745329F, 0F, 0F);
      FlailHandle = new ModelRenderer(this, 0, 0);
      FlailHandle.addBox(0F, 0F, 0F, 2, 2, 20);
      FlailHandle.setRotationPoint(-11F, -2.5F, -8F);
      FlailHandle.setTextureSize(128, 64);
      FlailHandle.mirror = true;
      setRotation(FlailHandle, -0.6632251F, 0F, 0F);
      FlailTip = new ModelRenderer(this, 0, 22);
      FlailTip.addBox(0F, 0F, 0F, 3, 3, 4);
      FlailTip.setRotationPoint(-11.5F, -3.5F, -8.5F);
      FlailTip.setTextureSize(128, 64);
      FlailTip.mirror = true;
      setRotation(FlailTip, -0.6632251F, 0F, 0F);
      FlailChain1 = new ModelRenderer(this, 14, 22);
      FlailChain1.addBox(0F, 0F, 0F, 2, 1, 2);
      FlailChain1.setRotationPoint(-11F, -3.8F, -10.4F);
      FlailChain1.setTextureSize(128, 64);
      FlailChain1.mirror = true;
      setRotation(FlailChain1, -0.6632251F, 0F, 0F);
      FlaillChain2 = new ModelRenderer(this, 32, 22);
      FlaillChain2.addBox(0F, 0F, 0F, 1, 2, 3);
      FlaillChain2.setRotationPoint(-10.5F, -3.2F, -13F);
      FlaillChain2.setTextureSize(128, 64);
      FlaillChain2.mirror = true;
      setRotation(FlaillChain2, 0.4363323F, 0F, 0F);
      FlailChain3 = new ModelRenderer(this, 22, 22);
      FlailChain3.addBox(0F, 0F, 0F, 2, 1, 3);
      FlailChain3.setRotationPoint(-11F, -1F, -14.2F);
      FlailChain3.setTextureSize(128, 64);
      FlailChain3.mirror = true;
      setRotation(FlailChain3, 0.8203047F, 0F, 0F);
      FlailChain4 = new ModelRenderer(this, 32, 22);
      FlailChain4.addBox(0F, 0F, 0F, 1, 2, 3);
      FlailChain4.setRotationPoint(-10.5F, 0.9F, -15.3F);
      FlailChain4.setTextureSize(128, 64);
      FlailChain4.mirror = true;
      setRotation(FlailChain4, 1.186824F, 0F, 0F);
      FlailChain = new ModelRenderer(this, 22, 22);
      FlailChain.addBox(0F, 0F, 0F, 2, 1, 3);
      FlailChain.setRotationPoint(-11F, 3F, -14.9F);
      FlailChain.setTextureSize(128, 64);
      FlailChain.mirror = true;
      setRotation(FlailChain, 1.413717F, 0F, 0F);
      FlailBody = new ModelRenderer(this, 44, 15);
      FlailBody.addBox(0F, 0F, 0F, 4, 2, 4);
      FlailBody.setRotationPoint(-12F, 3F, -16.5F);
      FlailBody.setTextureSize(128, 64);
      FlailBody.mirror = true;
      setRotation(FlailBody, 0F, 0F, 0F);
      FlailPoint1 = new ModelRenderer(this, 21, 27);
      FlailPoint1.addBox(0F, 0F, 0F, 1, 2, 4);
      FlailPoint1.setRotationPoint(-8F, 3F, -15.7F);
      FlailPoint1.setTextureSize(128, 64);
      FlailPoint1.mirror = true;
      setRotation(FlailPoint1, -0.122173F, 2.303835F, 0F);
      FlailPoint2 = new ModelRenderer(this, 21, 27);
      FlailPoint2.addBox(0F, 0F, 0F, 1, 2, 4);
      FlailPoint2.setRotationPoint(-8.7F, 3F, -12.5F);
      FlailPoint2.setTextureSize(128, 64);
      FlailPoint2.mirror = true;
      setRotation(FlailPoint2, -0.122173F, 0.8203047F, 0F);
      FlailPoint3 = new ModelRenderer(this, 21, 27);
      FlailPoint3.addBox(0F, 0F, 0F, 1, 2, 4);
      FlailPoint3.setRotationPoint(-11F, 3F, -16.2F);
      FlailPoint3.setTextureSize(128, 64);
      FlailPoint3.mirror = true;
      setRotation(FlailPoint3, -0.122173F, -2.303835F, 0F);
      FlailPoint4 = new ModelRenderer(this, 21, 27);
      FlailPoint4.addBox(0F, 0F, 0F, 1, 2, 4);
      FlailPoint4.setRotationPoint(-11.8F, 3F, -13.5F);
      FlailPoint4.setTextureSize(128, 64);
      FlailPoint4.mirror = true;
      setRotation(FlailPoint4, -0.122173F, -0.8203047F, 0F);
      FlailTip1 = new ModelRenderer(this, 14, 25);
      FlailTip1.addBox(0F, 0F, 0F, 1, 3, 1);
      FlailTip1.setRotationPoint(-6.2F, 4.5F, -18.6F);
      FlailTip1.setTextureSize(128, 64);
      FlailTip1.mirror = true;
      setRotation(FlailTip1, 0F, 0.7330383F, 0.0349066F);
      FlailTip2 = new ModelRenderer(this, 14, 25);
      FlailTip2.addBox(0F, 0F, 0F, 1, 3, 1);
      FlailTip2.setRotationPoint(-14.2F, 4.5F, -11.3F);
      FlailTip2.setTextureSize(128, 64);
      FlailTip2.mirror = true;
      setRotation(FlailTip2, -0.0349066F, -0.8028515F, 0F);
      FlailTip3 = new ModelRenderer(this, 14, 25);
      FlailTip3.addBox(0F, 0F, 0F, 1, 3, 1);
      FlailTip3.setRotationPoint(-6.3F, 4.5F, -10.2F);
      FlailTip3.setTextureSize(128, 64);
      FlailTip3.mirror = true;
      setRotation(FlailTip3, -0.0349066F, 0.8203047F, 0F);
      FlailTip4 = new ModelRenderer(this, 14, 25);
      FlailTip4.addBox(0F, 0F, 0F, 1, 3, 1);
      FlailTip4.setRotationPoint(-14.9F, 4.5F, -18.3F);
      FlailTip4.setTextureSize(128, 64);
      FlailTip4.mirror = true;
      setRotation(FlailTip4, 0.0349066F, 0.8726646F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Footleft.render(f5);
    FootRight.render(f5);
    LegBottomRight.render(f5);
    LegBottomLeft.render(f5);
    LegTopRight.render(f5);
    LegTopLeft.render(f5);
    LowerTorso.render(f5);
    UpperTorso.render(f5);
    PeckLeft.render(f5);
    PeckRight.render(f5);
    ShoulderRight.render(f5);
    UpperArmRight.render(f5);
    LowerArmRight.render(f5);
    HandRight.render(f5);
    FingerRight1.render(f5);
    FingeRight2.render(f5);
    FingerRight3.render(f5);
    Thumb.render(f5);
    ShoulderLeft.render(f5);
    UpperArmLeft.render(f5);
    LowerArmLeft.render(f5);
    HandRight.render(f5);
    FingerLeft1.render(f5);
    FingerLeft3.render(f5);
    Fingerleft2.render(f5);
    FingerLeft3Part1.render(f5);
    FingerLeft2Part1.render(f5);
    FingerLeft1Part1.render(f5);
    ThumbLeft.render(f5);
    ThumbLeftPart.render(f5);
    Neck.render(f5);
    Skull.render(f5);
    Chin.render(f5);
    ChinTip.render(f5);
    BeardPointRight.render(f5);
    BeardPointLeft.render(f5);
    Hair.render(f5);
    Hair2.render(f5);
    Hair3.render(f5);
    Hair4.render(f5);
    Hair5.render(f5);
    Hair6.render(f5);
    ShoulderGuardRightTop.render(f5);
    ShoulderGuardRightFront.render(f5);
    ShoulderGuardRightBack.render(f5);
    ShoulderGuardLeftTop.render(f5);
    ShoulderGuardLeftFront.render(f5);
    ShoudlerGuardLeftBack.render(f5);
    Braclet.render(f5);
    EarRight.render(f5);
    EarLeft.render(f5);
    Nose.render(f5);
    Spike1.render(f5);
    Spike2.render(f5);
    Spike3.render(f5);
    Spike4.render(f5);
    Spike5.render(f5);
    Spike6.render(f5);
    BootTop.render(f5);
    BootTop.render(f5);
    FlailHandle.render(f5);
    FlailTip.render(f5);
    FlailChain1.render(f5);
    FlaillChain2.render(f5);
    FlailChain3.render(f5);
    FlailChain4.render(f5);
    FlailChain.render(f5);
    FlailBody.render(f5);
    FlailPoint1.render(f5);
    FlailPoint2.render(f5);
    FlailPoint3.render(f5);
    FlailPoint4.render(f5);
    FlailTip1.render(f5);
    FlailTip2.render(f5);
    FlailTip3.render(f5);
    FlailTip4.render(f5);
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
		FootRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
		Footleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
	}

}