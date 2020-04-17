package srpfacadelab;

public class RpgPlayerFacade {
    private final IGameEngine gameEngine;
    private RpgPlayer player;

    public RpgPlayerFacade(IGameEngine gameEngine){
        this.gameEngine = gameEngine;
        player = new RpgPlayer(gameEngine);
    }

    public void useItem(Item item) {
        player.itemManage.useItem(item);
    }

    public boolean pickUpItem(Item item) {
        return player.itemManage.pickUpItem(item);
    }

    private void calculateStats() {
        player.combatManage.calculateStats();
    }

    private boolean checkIfItemExistsInInventory(Item item) {
        return player.inventoryManage.checkIfItemExistsInInventory(item);
    }

    private int calculateInventoryWeight() {
        return player.inventoryManage.calculateInventoryWeight();
    }

    public void takeDamage(int damage) {
        player.combatManage.takeDamage(damage);
    }

    public int getCarryingCapacity() {
        return player.inventoryManage.getCarryingCapacity();
    }

    private void setCarryingCapacity(int carryingCapacity) {
        player.inventoryManage.setCarryingCapacity(carryingCapacity);
    }

    public int getHealth() {
        return player.combatManage.getHealth();
    }

    public void setHealth(int health) {
        player.combatManage.setHealth(health);
    }

    public int getMaxHealth() {
        return player.combatManage.getMaxHealth();
    }

    public void setMaxHealth(int maxHealth) {
        player.combatManage.setHealth(maxHealth);
    }

    public int getArmour() {
        return player.combatManage.getArmour();
    }

    public void setArmour(int armour) {
        player.combatManage.setArmour(armour);
    }
}
