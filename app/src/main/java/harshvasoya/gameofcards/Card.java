package harshvasoya.gameofcards;

import android.media.Image;

/**
 * Created by Harsh on 03-07-2016.
 */
public class Card {

    private static final int CLUBS = 1;
    private static final int DIAMONDS = 2;
    private static final int HEARTS = 3;
    private static final int SPADES = 4;

    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    int x;

    private int card_num=0,suit_num=0;

    public Card(int suit,int card){
        card_num=card;
        suit_num=suit;
    }

    public int getSuitNum() {
        return suit_num;
    }

    public int getCardNum() {
        return card_num;
    }

    public String getSuitAsString()
    {
        switch(suit_num)
        {
            case SPADES: return "S";
            case CLUBS: return "C";
            case DIAMONDS: return "D";
            case HEARTS: return "H";
            default: return null;
        }
    }

    public String getNumAsString()
    {
        switch(card_num)
        {
            case 14: return "A";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return null;
        }
    }

    public String toString()
    {
        return getSuitAsString() + getNumAsString();
    }

    public int showPhoto(int card_no, int suit_no){

        if(suit_no == 1)
        {
            switch(card_no)
            {
                case 2:
                    x = R.drawable.two_c;
                    break;
                case 3:
                    x = R.drawable.three_c;
                    break;
                case 4:
                    x = R.drawable.four_c;
                    break;
                case 5:
                    x = R.drawable.five_c;
                    break;
                case 6:
                    x = R.drawable.six_c;
                    break;
                case 7:
                    x = R.drawable.seven_c;
                    break;
                case 8:
                    x = R.drawable.eight_c;
                    break;
                case 9:
                    x = R.drawable.nine_c;
                    break;
                case 10:
                    x = R.drawable.ten_c;
                    break;
                case 11:
                    x =  R.drawable.jack_c;
                    break;
                case 12:
                    x = R.drawable.queen_c;
                    break;
                case 13:
                    x = R.drawable.king_c;
                    break;
                case 14:
                    x = R.drawable.ace_c;
                    break;
            }
        }
        if(suit_no == 2)
        {
            switch(card_no)
            {
                case 2:
                    x = R.drawable.two_d;
                    break;
                case 3:
                    x = R.drawable.three_d;
                    break;
                case 4:
                    x = R.drawable.four_d;
                    break;
                case 5:
                    x = R.drawable.five_d;
                    break;
                case 6:
                    x = R.drawable.six_d;
                    break;
                case 7:
                    x = R.drawable.seven_d;
                    break;
                case 8:
                    x = R.drawable.eight_d;
                    break;
                case 9:
                    x = R.drawable.nine_d;
                    break;
                case 10:
                    x = R.drawable.ten_d;
                    break;
                case 11:
                    x = R.drawable.jack_d;
                break;
                case 12:
                    x = R.drawable.queen_d;
                break;
                case 13:
                    x = R.drawable.king_d;
                break;
                case 14:
                    x = R.drawable.ace_d;
                break;
            }
        }
        if(suit_no == 3)
        {
            switch(card_no)
            {
                case 2:
                    x = R.drawable.two_h;
                    break;
                case 3:
                    x = R.drawable.three_h;
                    break;
                case 4:
                    x = R.drawable.four_h;
                    break;
                case 5:
                    x = R.drawable.five_h;
                    break;
                case 6:
                    x = R.drawable.six_h;
                    break;
                case 7:
                    x = R.drawable.seven_h;
                    break;
                case 8:
                    x = R.drawable.eight_h;
                    break;
                case 9:
                    x = R.drawable.nine_h;
                    break;
                case 10:
                    x = R.drawable.ten_h;
                    break;
                case 11:
                    x = R.drawable.jack_h;
                break;
                case 12:
                    x = R.drawable.queen_h;
                break;
                case 13:
                    x = R.drawable.king_h;
                break;
                case 14:
                    x = R.drawable.ace_h;
                break;
            }
        }
        if(suit_no == 4)
        {
            switch(card_no)
            {
                case 2:
                    x = R.drawable.two_s;
                    break;
                case 3:
                    x = R.drawable.three_s;
                    break;
                case 4:
                    x = R.drawable.four_s;
                    break;
                case 5:
                    x = R.drawable.five_s;
                    break;
                case 6:
                    x = R.drawable.six_s;
                    break;
                case 7:
                    x = R.drawable.seven_s;
                    break;
                case 8:
                    x = R.drawable.eight_s;
                    break;
                case 9:
                    x = R.drawable.nine_s;
                    break;
                case 10:
                    x = R.drawable.ten_s;
                    break;
                case 11:
                    x = R.drawable.jack_s;
                break;
                case 12:
                    x = R.drawable.queen_s;
                break;
                case 13:
                    x = R.drawable.king_s;
                break;
                case 14:
                    x = R.drawable.ace_s;
                break;
            }
        }
        return x;
    }
}
