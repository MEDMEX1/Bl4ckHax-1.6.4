package net.minecraft.src;

import org.lwjgl.input.Keyboard;

import MEDMEX.Client;
import MEDMEX.Util.RenderUtils;
import MEDMEX.config.Silent;
import MEDMEX.events.listeners.EventChat;
import MEDMEX.events.listeners.EventMotion;

public class EntityClientPlayerMP extends EntityPlayerSP
{
	public static boolean cartaura = false;
	public static boolean antihunger = false;
	public static boolean customonground;
	public static boolean derp = false;
	public static float bedblockx, bedblockz;
	public static long bedtimer, bedtimermain;
	public static boolean bedaura = false;
	public static boolean rotationoverride = false;
	public static float customyaw;
	public static float custompitch;
	public static boolean flatten = false;
	public static boolean jesusoverride = false;
	long timer = 0l;
	public static boolean silent = false;
	public static boolean xcarry = false;
	public static boolean cancellook = false;
	public static boolean aura = false;
    public NetClientHandler sendQueue;
    private double oldPosX;

    /** Old Minimum Y of the bounding box */
    private double oldMinY;
    private double oldPosY;
    private double oldPosZ;
    private float oldRotationYaw;
    private float oldRotationPitch;

    /** Check if was on ground last update */
    private boolean wasOnGround;

    /** should the player stop sneaking? */
    private boolean shouldStopSneaking;
    private boolean wasSneaking;
    private int field_71168_co;

    /** has the client player's health been set? */
    private boolean hasSetHealth;
    private String field_142022_ce;
    public static boolean freecamenabled = false;

    public EntityClientPlayerMP(Minecraft par1Minecraft, World par2World, Session par3Session, NetClientHandler par4NetClientHandler)
    {
        super(par1Minecraft, par2World, par3Session, 0);
        this.sendQueue = par4NetClientHandler;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
        return false;
    }

    /**
     * Heal living entity (param: amount of half-hearts)
     */
    public void heal(float par1) {}

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.worldObj.blockExists(MathHelper.floor_double(this.posX), 0, MathHelper.floor_double(this.posZ)))
        {
            super.onUpdate();

            if (this.isRiding())
            {
                this.sendQueue.addToSendQueue(new Packet12PlayerLook(this.rotationYaw, this.rotationPitch, this.onGround));
                this.sendQueue.addToSendQueue(new Packet27PlayerInput(this.moveStrafing, this.moveForward, this.movementInput.jump, this.movementInput.sneak));
            }
            else
            {
                this.sendMotionUpdates();
            }
        }
    }

    /**
     * Send updated motion and position information to the server
     */
    public void sendMotionUpdates()
    {
    	if(!antihunger) {
    		customonground = this.onGround;
    	}
    	
    	
    	if(!jesusoverride) {
    		
    	}
    	
    	if(!rotationoverride) {
        	customyaw = this.rotationYaw;
        	custompitch = this.rotationPitch;
        }
    	
    	if(cartaura) {
    		for(int i = 0; i < mc.theWorld.loadedEntityList.size(); i++) {
    			if((Entity)mc.theWorld.loadedEntityList.get(i) != this &&  getDistanceSqToEntity((Entity)mc.theWorld.loadedEntityList.get(i))<16D) {
    				if(((Entity)mc.theWorld.loadedEntityList.get(i) instanceof EntityMinecartChest)){
    					if(mc.thePlayer.canEntityBeSeen((Entity)mc.theWorld.loadedEntityList.get(i))){
        				float x = getPosX((Entity)mc.theWorld.loadedEntityList.get(i));
        				float z = getPosZ((Entity)mc.theWorld.loadedEntityList.get(i));
        				float y = getPosY((Entity)mc.theWorld.loadedEntityList.get(i));
        				float yaw = (float) -(Math.atan2((x-mc.thePlayer.posX),(z-mc.thePlayer.posZ))*(180.0/Math.PI));
        				float pitch = (float) -(Math.asin((y - mc.thePlayer.posY) / getDistanceToEntity((Entity)mc.theWorld.loadedEntityList.get(i)))*(180.0/Math.PI));
						mc.thePlayer.rotationYaw = yaw;
						mc.thePlayer.rotationPitch = pitch;
						mc.gameSettings.keyBindUseItem.pressed = true;
    					}
    				}else {
    					mc.gameSettings.keyBindUseItem.pressed = false;
    				}
    					
    				}
    					
    				}
    	}
    	
    	
    	if(bedaura) {
    		for(int i = 0; i < mc.theWorld.loadedEntityList.size(); i++) {
    			if((Entity)mc.theWorld.loadedEntityList.get(i) != this &&  getDistanceSqToEntity((Entity)mc.theWorld.loadedEntityList.get(i))<25D) {
    				if(((Entity)mc.theWorld.loadedEntityList.get(i) instanceof EntityPlayer)){
    					float x = getPosX((Entity)mc.theWorld.loadedEntityList.get(i));
    					float z = getPosZ((Entity)mc.theWorld.loadedEntityList.get(i));
    					float y = getPosY((Entity)mc.theWorld.loadedEntityList.get(i));
    					float px = (float) mc.thePlayer.posX;
    					float pz = (float) mc.thePlayer.posZ;
    					float dx = px -x;
    					float dz = pz -z;
    					float realx = (float)mc.thePlayer.posX + (dx*-1);
    					float realz = (float)mc.thePlayer.posZ + (dz*-1);
    					int placex = (int)(realx-1);
    					int placez = (int) (realz-1);
    					bedtimermain++;
    					if(bedtimermain >= 2) {
    					bedtimer++;
    					if(bedtimer == 1) {
    						bedblockx = x+1;
    						bedblockz = z;
    					}
    					if(bedtimer == 2) {
    						bedblockx = x+1;
    						bedblockz = z-1;
    					}
    					if(bedtimer == 3) {
    						bedblockx = x;
    						bedblockz = z-1;
    					}
    					if(bedtimer == 4) {
    						bedblockx = x-1;
    						bedblockz = z-1;
    					}
    					if(bedtimer == 5) {
    						bedblockx = x-1;
    						bedblockz = z;
    					}
    					if(bedtimer == 6) {
    						bedblockx = x-1;
    						bedblockz = z+1;
    					}
    					if(bedtimer == 7) {
    						bedblockx = x;
    						bedblockz = z+1;
    					}
    					if(bedtimer == 8) {
    						bedblockx = x+1;
    						bedblockz = z+1;
    						bedtimer = 0l;
    					}
    					bedtimermain = 0l;  					
    					if(mc.theWorld.isAirBlock(placex, (int)y, placez)) {
    						int bestSlot = -1;
    						for(int j = 0; j < 9; j++) {
    							ItemStack stack =
    									mc.thePlayer.inventory.getStackInSlot(j);
    								if(stack == null || !(stack.getItem() instanceof ItemBed))
    									continue;
    								bestSlot = j;
    								mc.thePlayer.inventory.currentItem = bestSlot;
    								
    						
    						rotationoverride = true;
    						float yaw = (float) -(Math.atan2((bedblockx-mc.thePlayer.posX),(bedblockz-mc.thePlayer.posZ))*(180.0/Math.PI));
    						float pitch = (float)  -(Math.asin(((y-1) - mc.thePlayer.posY) / mc.thePlayer.getDistance(bedblockx, y-1, bedblockz))*(180.0/Math.PI));
    						customyaw = yaw;
    						custompitch = pitch;
    						mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place((int)bedblockx, (int)y-1, (int)bedblockz, 1, Minecraft.thePlayer.inventory.getStackInSlot(mc.thePlayer.inventory.currentItem), 0, 0 ,0));
    						mc.thePlayer.swingItem();
    						
    						
    						}
    					}
    					
    				}
    				}
    					
    				}else {
    					rotationoverride = false;
    				}
    					
    				}
    	}
    	
    	
    	
    	if(aura == true) {
    		for(int i = 0; i < mc.theWorld.loadedEntityList.size(); i++) {
    			if((Entity)mc.theWorld.loadedEntityList.get(i) != this &&  getDistanceSqToEntity((Entity)mc.theWorld.loadedEntityList.get(i))<16D) {
    				if(((Entity)mc.theWorld.loadedEntityList.get(i) instanceof EntityLivingBase)){
    					String target = getusername((Entity)mc.theWorld.loadedEntityList.get(i));
    					String list = Client.friendslist;
    					if(!list.contains(target)) {
    					float x = getPosX((Entity)mc.theWorld.loadedEntityList.get(i));
    					float z = getPosZ((Entity)mc.theWorld.loadedEntityList.get(i));
    					float y = getPosY((Entity)mc.theWorld.loadedEntityList.get(i));
    					
    					RendererLivingEntity.auratarget = target;
    					
    					
    					float yaw = (float) -(Math.atan2((x-mc.thePlayer.posX),(z-mc.thePlayer.posZ))*(180.0/Math.PI));
    					float pitch = (float) -(Math.asin((y - mc.thePlayer.posY) / getDistanceToEntity((Entity)mc.theWorld.loadedEntityList.get(i)))*(180.0/Math.PI));
    					if(Silent.bool == "True") {
    					mc.thePlayer.setRotation(yaw, pitch);
    					}else {
    						rotationoverride = true;
    						customyaw = yaw;
    						custompitch = pitch;
    						
    						
    						
    						
    						
    						//mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(yaw, pitch, true));
    					}
    					timer++;
    					if(timer == 3) {
    					mc.playerController.attackEntity(this, (Entity)mc.theWorld.loadedEntityList.get(i));
    					swingItem();
    					timer = 0l;
    					}
    					}
    					
    					
    				
    				}
    			}else {
    				if(!mc.thePlayer.isSwingInProgress) {
    				rotationoverride = false;
    				}
    			}
    		}
    	}else {
    		RendererLivingEntity.auratarget = "";
    	}
    	
    	if(flatten) {
    		byte byte0 = 3;
    		byte byte1 = 3;
    		byte byte2 = 3;
    		byte byte4 = 3;
    		for(int k = byte0; k > -byte0; k--) {
    			for(int i1 = byte1; i1 > -byte1; i1--) {
    				for(int j1 = byte2; j1 > -byte2; j1--) {
    					double d1 = mc.thePlayer.posX + (double)k;
    					double d3 = mc.thePlayer.posY -1;
    					double d5 = mc.thePlayer.posZ + (double)j1;
    					int k1 = (int)d1;
    					int l1 = (int)d3;
    					int i2 = (int)d5;
    					int j2 = mc.theWorld.getBlockId(k1, l1 , i2);
    					Block block = Block.blocksList[j2];
    					if(block != null) {
    						timer++;
    						if(timer == 18) {
    							NetServerHandler.freecamenabled = true;
    							EntityClientPlayerMP.freecamenabled = true;
    						float yaw = (float) -(Math.atan2((k1-mc.thePlayer.posX),(i2-mc.thePlayer.posZ))*(180.0/Math.PI));
    	    				float pitch = (float) -(Math.asin((l1 - mc.thePlayer.posY) / mc.thePlayer.getDistance(k1, l1, i2))*(180.0/Math.PI));
    	    				//mc.thePlayer.rotationYaw = yaw;
    	    				//mc.thePlayer.rotationPitch = pitch;
    	    				//mc.thePlayer.sendQueue.addToSendQueue(new Packet12PlayerLook(yaw, pitch, true));
    	    				RenderGlobal.flatten = true;
    	    				RenderGlobal.flattenx = k1;
    	    				RenderGlobal.flatteny = l1;
    	    				RenderGlobal.flattenz = i2;
    	    				mc.thePlayer.sendQueue.addToSendQueue(new Packet13PlayerLookMove(mc.thePlayer.posX, mc.thePlayer.boundingBox.minY, mc.thePlayer.posY, mc.thePlayer.posZ, yaw, pitch, true));
    						mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(0 , k1, l1, i2, 1));
    						mc.thePlayer.sendQueue.addToSendQueue(new Packet14BlockDig(2, k1, l1, i2, 1));
    						mc.thePlayer.swingItem();
    						timer = 0l;
    						}else {
    							NetServerHandler.freecamenabled = false;
    							EntityClientPlayerMP.freecamenabled = false;
    						}
    					}
    					
    				}
    			}
    		}
    	}
    	
    	
    	
    	
        boolean var1 = this.isSprinting();

        if (var1 != this.wasSneaking)
        {
            if (var1)
            {
            	if(!antihunger) {
                this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 4));
            	}
            }
            else
            {
            	if(!antihunger) {
                this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 5));
            	}
            }

            this.wasSneaking = var1;
        }

        boolean var2 = this.isSneaking();

        if (var2 != this.shouldStopSneaking)
        {
            if (var2)
            {
                this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 1));
            }
            else
            {
                this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 2));
            }

            this.shouldStopSneaking = var2;
        }

        double var3 = this.posX - this.oldPosX;
        double var5 = this.boundingBox.minY - this.oldMinY;
        double var7 = this.posZ - this.oldPosZ;
        double var9 = (double)(customyaw - this.oldRotationYaw);
        double var11 = (double)(custompitch - this.oldRotationPitch);
        boolean var13 = var3 * var3 + var5 * var5 + var7 * var7 > 9.0E-4D || this.field_71168_co >= 20;
        boolean var14 = var9 != 0.0D || var11 != 0.0D;
        
        if(freecamenabled == false) {
        if (this.ridingEntity != null)
        {
            this.sendQueue.addToSendQueue(new Packet13PlayerLookMove(this.motionX, -999.0D, -999.0D, this.motionZ, customyaw, custompitch, customonground));
            var13 = false;
        }
        else if (var13 && var14)
        {
            this.sendQueue.addToSendQueue(new Packet13PlayerLookMove(this.posX, this.boundingBox.minY, this.posY, this.posZ, customyaw, custompitch, customonground));
        }
        else if (var13)
        {
            this.sendQueue.addToSendQueue(new Packet11PlayerPosition(this.posX, this.boundingBox.minY,this.posY, this.posZ, customonground));
        }
        else if (var14)
        {
        	if(cancellook == false) {
            this.sendQueue.addToSendQueue(new Packet12PlayerLook(customyaw, custompitch, this.onGround));
        	}
        }
        else
        {
            this.sendQueue.addToSendQueue(new Packet10Flying(customonground));
        }

        ++this.field_71168_co;
        this.wasOnGround = customonground;

        if (var13)
        {
            this.oldPosX = this.posX;
            this.oldMinY = this.boundingBox.minY;
            this.oldPosY = this.posY;
            this.oldPosZ = this.posZ;
            this.field_71168_co = 0;
        }

        if (var14)
        {
            this.oldRotationYaw = customyaw;
            this.oldRotationPitch = custompitch;
        }
        }
    }

    /**
     * Called when player presses the drop item key
     */
    public EntityItem dropOneItem(boolean par1)
    {
        int var2 = par1 ? 3 : 4;
        this.sendQueue.addToSendQueue(new Packet14BlockDig(var2, 0, 0, 0, 0));
        return null;
    }

    /**
     * Joins the passed in entity item with the world. Args: entityItem
     */
    protected void joinEntityItemWithWorld(EntityItem par1EntityItem) {}

    /**
     * Sends a chat message from the player. Args: chatMessage
     */
    public void sendChatMessage(String par1Str)
    {
    	EventChat event = new EventChat(par1Str);
    	
    	Client.onEvent(event);
    	
    	if(event.isCancelled())
    		return;
        this.sendQueue.addToSendQueue(new Packet3Chat(event.getMessage()));
    }

    /**
     * Swings the item the player is holding.
     */
    public void swingItem()
    {
        super.swingItem();
        this.sendQueue.addToSendQueue(new Packet18Animation(this, 1));
    }

    public void respawnPlayer()
    {
        this.sendQueue.addToSendQueue(new Packet205ClientCommand(1));
    }

    /**
     * Deals damage to the entity. If its a EntityPlayer then will take damage from the armor first and then health
     * second with the reduced value. Args: damageAmount
     */
    protected void damageEntity(DamageSource par1DamageSource, float par2)
    {
        if (!this.isEntityInvulnerable())
        {
            this.setHealth(this.getHealth() - par2);
        }
    }

    /**
     * sets current screen to null (used on escape buttons of GUIs)
     */
    public void closeScreen()
    {
    	if(!xcarry) {
        this.sendQueue.addToSendQueue(new Packet101CloseWindow(this.openContainer.windowId));
    	}
    	this.func_92015_f();
    }

    public void func_92015_f()
    {
        this.inventory.setItemStack((ItemStack)null);
        super.closeScreen();
    }

    /**
     * Updates health locally.
     */
    public void setPlayerSPHealth(float par1)
    {
        if (this.hasSetHealth)
        {
            super.setPlayerSPHealth(par1);
        }
        else
        {
            this.setHealth(par1);
            this.hasSetHealth = true;
        }
    }

    /**
     * Adds a value to a statistic field.
     */
    public void addStat(StatBase par1StatBase, int par2)
    {
        if (par1StatBase != null)
        {
            if (par1StatBase.isIndependent)
            {
                super.addStat(par1StatBase, par2);
            }
        }
    }

    /**
     * Used by NetClientHandler.handleStatistic
     */
    public void incrementStat(StatBase par1StatBase, int par2)
    {
        if (par1StatBase != null)
        {
            if (!par1StatBase.isIndependent)
            {
                super.addStat(par1StatBase, par2);
            }
        }
    }

    /**
     * Sends the player's abilities to the server (if there is one).
     */
    public void sendPlayerAbilities()
    {
        this.sendQueue.addToSendQueue(new Packet202PlayerAbilities(this.capabilities));
    }

    protected void func_110318_g()
    {
        this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 6, (int)(this.getHorseJumpPower() * 100.0F)));
    }

    public void func_110322_i()
    {
        this.sendQueue.addToSendQueue(new Packet19EntityAction(this, 7));
    }

    public void func_142020_c(String par1Str)
    {
        this.field_142022_ce = par1Str;
    }

    public String func_142021_k()
    {
        return this.field_142022_ce;
    }
}
