interface IWeapon {
    use(): void
}

class Mecha {
    attack(weapon: IWeapon) {
        weapon.use()
    }
}

// WEAPONS 

class Sword {
    slash() {
        console.log('Sword slash')
    }
}

class MachineGun {
    fire() {
        console.log('Machine gun fire')
    }
}

// ADAPTERs 
class SwordAdapter extends Sword implements IWeapon {
    use(): void {
        this.slash()
    }
}

class MachineGunAdapter extends MachineGun implements IWeapon {
    use(): void {
        this.fire()
    }
}

const mecha = new Mecha()

mecha.attack(new SwordAdapter())
mecha.attack(new MachineGunAdapter())