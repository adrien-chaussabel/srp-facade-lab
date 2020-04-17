package srpfacadelab;

public class InventoryManage extends RpgPlayer {

    public InventoryManage(IGameEngine gameEngine) {
        super(gameEngine);
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        for (Item i : inventory) {
            if (i.getId() == item.getId())
                return true;
        }
        return false;
    }

    public int calculateInventoryWeight() {
        int sum = 0;
        for (Item i : inventory) {
            sum += i.getWeight();
        }
        return sum;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
