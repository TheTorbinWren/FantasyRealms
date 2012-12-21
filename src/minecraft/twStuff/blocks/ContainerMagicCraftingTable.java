package twStuff.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMagicCraftingTable extends Container {
	private TileEntityMagicCraftingTable tileEntity;
	
	public ContainerMagicCraftingTable(InventoryPlayer inventoryPlayer, TileEntityMagicCraftingTable te){
		tileEntity = te;
		addSlotToContainer(new Slot(tileEntity, 0, 9, 17));
		addSlotToContainer(new Slot(tileEntity, 1, 9, 35));
		addSlotToContainer(new Slot(tileEntity, 2, 9, 53));
		
		for (int r=0;r<3;r++){
			for (int c=0;c<3;c++){
				addSlotToContainer(new Slot(tileEntity, r*3+c+3, c*18+57, r*18+17));
			}
		}
		addSlotToContainer(new Slot(tileEntity, 12, 145, 35));
		bindPlayerInventory(inventoryPlayer);
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);	
	}

    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 9; j++) {
        		addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 12,
        				8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
        	addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
            ItemStack stack = null;
            Slot slotObject = (Slot) inventorySlots.get(slot);

            //null checks and checks if the item can be stacked (maxStackSize > 1)
            if (slotObject != null && slotObject.getHasStack()) {
                    ItemStack stackInSlot = slotObject.getStack();
                    stack = stackInSlot.copy();

                    //merges the item into player inventory since its in the tileEntity
                    //this assumes only 1 slot, for inventories with > 1 slots, check out the Chest Container.
                    if (slot == 0) {
                            if (!mergeItemStack(stackInSlot, 1,
                                            inventorySlots.size(), true)) {
                                    return null;
                            }
                    //places it into the tileEntity is possible since its in the player inventory
                    } else if (!mergeItemStack(stackInSlot, 0, 1, false)) {
                            return null;
                    }

                    if (stackInSlot.stackSize == 0) {
                            slotObject.putStack(null);
                    } else {
                            slotObject.onSlotChanged();
                    }
            }

            return stack;
    }

}
