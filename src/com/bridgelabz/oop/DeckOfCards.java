package com.bridgelabz.oop;

public class DeckOfCards {

        static String[] suit= {"Clubs","Diamonds", "Hearts", "Spades"};
        static String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

        static String[] cards=new String[52];
        static String[][] playerCards= new String[4][9];

        public  static void getcards(){
            int k=0;

            for (int i = 0; i < suit.length; i++) {
                for (int j = 0; j < rank.length; j++) {
                    cards[k] = suit[i] + "-" + rank[j];
                    k++;
                }
            }
        }

        public static String[] shuffleCards() {
            String temp="";

            for (String card : cards) {

                int randomnumber=(int)(Math.random()*10);

                temp=cards[randomnumber];
                cards[randomnumber]=card;
                card=temp;


            }
            return cards;
        }

        public static void distributeCard(String[] cards)
        {
            int k=0;

            for(int i=0;i<4;i++)
            {
                System.out.print("Player "+(i+1)+" :- ");

                for(int j=0;j<9;j++)
                {
                    playerCards[i][j]=cards[k];
                    System.out.print(playerCards[i][j]+" ");
                    k++;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            DeckOfCards.getcards();
            String[] card=DeckOfCards.shuffleCards();
            DeckOfCards.distributeCard(card);
        }
    }

