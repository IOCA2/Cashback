package ru.netology.unit;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// public class TestClassTestNG {
   // @Test
   // public void Test1() {
      //  CashbackHackerService service = new CashbackHackerService();
     //   int amount = 1001;
   //     int actual = service.remain(amount);
    //    int expected = 0;
   //     assertEquals(expected, actual);
  //  }

  //  @Test
   // public void Test2() {
      //  CashbackHackerService service = new CashbackHackerService();
       // int amount = 999;
      //  int actual = service.remain(amount);
       // int expected = 0;
      //  assertEquals(expected, actual);
    //}
//}
/// Не обращайте внимания на код сверху

public class TestClassTestNG {

    @org.junit.Test
    public void Test1() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void Test2() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}