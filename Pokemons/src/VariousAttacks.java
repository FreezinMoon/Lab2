import ru.ifmo.se.pokemon.*;

class TeeterDance extends StatusMove {
    protected TeeterDance() {
        super(Type.NORMAL, 1, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "имеет 100% шанс запутать врага";
    }
}

class Agility extends StatusMove {
    protected Agility() {
        super(Type.PSYCHIC, 1, 1000);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "увеличивает показатель скорости на 2 ступени";
    }
}

class DoubleSlap extends PhysicalMove {
    protected DoubleSlap() {
        super(Type.NORMAL, 15, 85, 0, 2 + (int) Math.round(Math.random() * 3));
    }

    @Override
    protected String describe() {
        return "заставляет пользователя нанести от 2 до 5 ударов подряд";
    }
}

class DoubleTeam extends StatusMove {
    protected DoubleTeam() {
        super(Type.NORMAL, 1, 1000);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "увеличивает показатель уклонения на 1 ступень";
    }
}

class Swagger extends StatusMove {
    protected Swagger() {
        super(Type.NORMAL, 1, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "имеет 100% шанс запутать врага и увеличивает показатель атаки противника на 2 ступени";
    }
}

class Facade extends PhysicalMove {
    protected Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status Condition = p.getCondition();
        if (Condition.equals(Status.BURN) || Condition.equals(Status.POISON) || Condition.equals(Status.PARALYZE))
            p.setMod(Stat.HP, (int) Math.round(damage * 2));

    }

    @Override
    protected String describe() {
        return "удваивает силу, если враг обожжён, отравлен или парализован";
    }
}

class Waterfall extends PhysicalMove {
    protected Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "имеет 20% шанс заставить врага дрогнуть";
    }
}

class FeintAttack extends PhysicalMove {
    protected FeintAttack() {
        super(Type.DARK, 60, 1000);
    }
}

class Rest extends StatusMove {
    protected Rest() {
        super(Type.PSYCHIC, 1, 1000);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition((new Effect()).condition(Status.SLEEP).attack(0.0).turns(2));
        p.setMod(Stat.HP, (int) Math.round(p.getHP() - p.getStat(Stat.HP)));
    }

    @Override
    protected String describe() {
        return "засыпает на два хода. Это полностью восстанавливает HP и исцеляет любые статусные состояния";
    }
}

class Bulldoze extends PhysicalMove {
    protected Bulldoze() {
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "понижает показатель скорости врага на 1 ступень";
    }
}

class BugBuzz extends SpecialMove {
    protected BugBuzz() {
        super(Type.BUG, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "понижает показать специальной защиты врага на 1 ступень с 10% шансом";
    }
}

class DracoMeteor extends SpecialMove {
    protected DracoMeteor() {
        super(Type.DRAGON, 130, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "понижает показать специальной атаки врага на 2 ступени";
    }
}
