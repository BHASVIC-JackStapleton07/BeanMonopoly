package src;

import java.util.Random;
public class DiceRoller
{
        private int dice1;
        private int dice2;
        private boolean isDouble;

        public DiceRoller()
        {
            rollDice();
        }

        public void rollDice()
        {
            Random random = new Random();
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            if (dice1 == dice2) { isDouble = true; } else { isDouble = false; }
        }

        public int getTotalScore()
        {
            return dice1 + dice2;
        }

        public boolean isDouble()
        {
            return isDouble;
        }

        //public static void main(String[] args)
//        {
//                DiceRoller diceRoller = new DiceRoller();
//                System.out.println("Dice 1: " + diceRoller.dice1);
//                System.out.println("Dice 2: " + diceRoller.dice2);
//                System.out.println("Total Score: " + diceRoller.getTotalScore());
//                System.out.println("Is double: " + diceRoller.isDouble());
//        }
}