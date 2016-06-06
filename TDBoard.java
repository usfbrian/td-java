import java.util.*;

class TDBoard {

  public ArrayList<TDLoyal> loyalList;
  public ArrayList<TDEnemy> enemyList;

  public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
  }

  public Day dayOfWeek = Day.SUNDAY;

  public TDBoard() {
    loyalList = new ArrayList<TDLoyal>();
    enemyList = new ArrayList<TDEnemy>();
    enemyList.add(new TDEnemy());
    enemyList.add(new TDEnemy());
    enemyList.add(new TDEnemy());
  }

  public static void main(String[] args) {
    TDBoard q = new TDBoard();
//    for (TDEnemy enemy : q.objList)
//      System.out.println(enemy.getX());
    System.out.println(q.dayOfWeek);
  }
}
