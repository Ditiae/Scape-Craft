package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityKing extends EntityMob
{
    private float moveSpeed;
	public EntityKing(World par1World)
    {
        super(par1World);

        this.moveSpeed = 0.4F;
        this.func_82163_bD();
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackGuard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackDragon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackKnight.class, this.moveSpeed, false));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEliteBlackKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityEliteBlackKnight.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGreenDragon.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTheif.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTheif.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityCreeper.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySpider.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBot.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBot.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLesserDemon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLesserDemon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDarkwizard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDarkwizard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGoblin.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGoblin.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityScorpion.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityScorpion.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHellhound.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));
        
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLesserDemon2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLesserDemon2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHighMage.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHighMage.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWither.class, this.moveSpeed, false));
    
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantGrimspike.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantGrimspike.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantSteelwill.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantSteelwill.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantStrongstack.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantStrongstack.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGeneralGraardor.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGeneralGraardor.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAhrim.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityAhrim.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTorag.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTorag.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVerac.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVerac.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuthan.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGuthan.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKaril.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKaril.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDharok.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDharok.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAkrisae.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityAkrisae.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));

    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(300.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.70D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(14.0D);
    
    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(0.3D);
	    }
    public String getEntityName()
    {
      return "King";
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    
    public boolean isAIEnabled()
    {
        return true;
    }
    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

      
    }




    /**
     * Returns the sound this mob makes while it's alive.
protected String getLivingSound()
    {
        return "mob.villager.default";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.villager.defaulthurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.villager.defaultdeath";
    }
    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int var1, int var2, int var3, int var4)
    {
        this.worldObj.playSoundAtEntity(this, "mob.villager.default", 0.15F, 1.0F);
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity par1Entity, float par2)
    {
        float var3 = this.getBrightness(1.0F);

        if (var3 > 0.5F && this.rand.nextInt(100) == 0)
        {
            this.entityToAttack = null;
        }
        else
        {
            if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)
            {
                if (this.onGround)
                {
                    double var4 = par1Entity.posX - this.posX;
                    double var6 = par1Entity.posZ - this.posZ;
                    float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
                    this.motionX = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
                    this.motionZ = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
                    this.motionY = 0.4000000059604645D;
                }
            }
            else
            {
                super.attackEntity(par1Entity, par2);
            }
        }
    }

    protected EntityKingsGuard createInstance()
    {
        return new EntityKingsGuard(this.worldObj);
    }
    
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
    	  Entity entity;
    	  entity = par1DamageSource.getSourceOfDamage();
    	  if (entity instanceof EntityArrow)
          {
              return false;
          }
    	  
    	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
              EntityKingsGuard entityKingsGuard = this.createInstance();
              
              entityKingsGuard.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D, this.posZ + (double)f1, this.rand.nextFloat() * 360.0F, 0.0F);
              this.worldObj.spawnEntityInWorld(entityKingsGuard);
              
              
          }}
    	
    	   return super.attackEntityFrom(par1DamageSource, par2);
    }
    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(10) + 1;
        int quickvar1 = rand.nextInt(150) + 1;
        int quickvar2 = rand.nextInt(30) + 1;
        int quickvar3 = rand.nextInt(30) + 1;
        int quickvar4 = rand.nextInt(1) + 1;
        int quickvar5 = rand.nextInt(1) + 1;
        int quickvar6 = rand.nextInt(1) + 1;
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(mod_BlocksGalore.Runesword), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.sarasword), 1);
        	MinecraftServer.getServer().getConfigurationManager().sendChatMsg((new ChatMessageComponent().addText("The king has dropped a saradomin sword!")));
        }
if(quickvar2 <= 1){
            
        	entityDropItem(new ItemStack(mod_phat.runeLeggings), 1);
         
        }
if(quickvar3 <= 1){
    
	entityDropItem(new ItemStack(mod_BlocksGalore.DD), 1);
	MinecraftServer.getServer().getConfigurationManager().sendChatMsg((new ChatMessageComponent().addText("The King has dropped a dragon dagger")));
}
if(quickvar4 <= 1){
    
	entityDropItem(new ItemStack(mod_phat.whiteHelmet), 1);
 
}
if(quickvar5 <= 1){
    
	entityDropItem(new ItemStack(mod_phat.whiteChestplate), 1);
 
}
if(quickvar6 <= 1){
    
	entityDropItem(new ItemStack(Item.ingotGold), 3);
	entityDropItem(new ItemStack(mod_Flower.BXPORB), 4);
	
	 
    //Medium value table//
    if(quickvar6 >5 && quickvar6<=10){entityDropItem(new ItemStack(Item.ingotGold), 1);}
    if(quickvar6 >10 && quickvar6<=15){entityDropItem(new ItemStack(mod_BlocksGalore.Mithore), 1);}
    if(quickvar6 >15 && quickvar6<=20){entityDropItem(new ItemStack(mod_BlocksGalore.Whitesword), 1);}
    if(quickvar6 >20 && quickvar6<=25){entityDropItem(new ItemStack(mod_BlocksGalore.Blacksword), 1);}
    if(quickvar6 >25 && quickvar6<=30){entityDropItem(new ItemStack(mod_phat.blackLeggings), 1);}
    if(quickvar6 >30 && quickvar6<=35){entityDropItem(new ItemStack(mod_phat.blackBoots), 1);}
    if(quickvar6 >35 && quickvar6<=50){entityDropItem(new ItemStack(Item.coal,3), 1);}
    if(quickvar6 >50 && quickvar6<=55){entityDropItem(new ItemStack(mod_BlocksGalore.Mithore), 1);}
    if(quickvar6 >50 && quickvar6<=55){entityDropItem(new ItemStack(mod_BlocksGalore.Addyore), 1);}
    if(quickvar6 >55 && quickvar6<=75){entityDropItem(new ItemStack(Item.arrow,10), 1);}
    if(quickvar6 >75 && quickvar6<=90){entityDropItem(new ItemStack(Item.wheat,10), 1);}
    if(quickvar6 >90 && quickvar6<=91){entityDropItem(new ItemStack(mod_BlocksGalore.Runeaxe), 1);}
    if(quickvar6 >91 && quickvar6<=92){entityDropItem(new ItemStack(mod_BlocksGalore.Runesword), 1);}
    if(quickvar6 >92 && quickvar6<=93){entityDropItem(new ItemStack(mod_BlocksGalore.Runeshovel), 1);}
    if(quickvar6 >93 && quickvar6<=94){entityDropItem(new ItemStack(mod_BlocksGalore.Runepickaxe), 1);}
    if(quickvar6 >94 && quickvar6<=95){entityDropItem(new ItemStack(mod_BlocksGalore.Runelump), 1);}
    
	MinecraftServer.getServer().getConfigurationManager().sendChatMsg((new ChatMessageComponent().addText("The King has been killed, varrock panics")));
}
        }
    
    
 
    @Override
    protected boolean canDespawn()
    {
            return true;
    }

   

 

    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 600 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        
    public void func_82163_bD()
    {
    	 
    	 this.setCanPickUpLoot(this.rand.nextFloat() < equipmentDropChances[this.worldObj.difficultySetting]);
    	   if (this.getCurrentItemOrArmor(4) == null){
    	
            this.setCurrentItemOrArmor(4, new ItemStack(mod_phat.yphatHelmet2));
          //  this.setCurrentItemOrArmor(1, new ItemStack(mod_phat.dragonBoots));
          //  this.setCurrentItemOrArmor(2, new ItemStack(mod_phat.whiteLeggings));
         //   this.setCurrentItemOrArmor(3, new ItemStack(mod_phat.guardChestplate));
       this.equipmentDropChances[4] = 0.0F;
         //    System.out.println("Test");
             
         }
    }
    
    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.RAPIER, 1);
         }
 
 
 
 public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
 

 
 @SideOnly(Side.CLIENT)	 
 public boolean interact(EntityPlayer par1EntityPlayer)
 {
	 int chat = randInt(1,10);
	  if(!worldObj.isRemote) {
	  if (chat == 1) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: Show better respect for your monarch");}
	  if (chat == 2) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: *The king ignores you completely");}	  
	  if (chat == 3) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: You look like you could be of service to the realm");}
	  if (chat == 4) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: My crown? No of course it isn't for sale, your neck should come off just for asking");}
	  if (chat == 5) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: Stay vigilant against the black knights");}
	  if (chat == 6) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: Its good to be king");}
	  if (chat == 7) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: I used be to quite the top quality fighter back in my day");}
	  if (chat == 8) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: What do you want? Looking to contribute extra taxes?");}
	  if (chat == 9) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: We are not recruiting right now");}
	  if (chat == 10) {ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EKing: Go bother someone else");}	  
	  }
     return super.interact(par1EntityPlayer);
 }

 public int getTotalArmorValue()
 {
     return 15;
 }
}
