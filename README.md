# Ивана Георгиевска 225128
# CFG
![graf](https://github.com/ivanageorgievska/SI_2024_lab2_225128/assets/166565130/c75eabd9-9475-40f6-9510-9e369fcdf111)
# Цикломатска комплексност
  Цикломатската комплексност на графот изнесува 10 поради формулата p+1(p=број на предикатни јазли).
# Every Branch
   Test case: allItems=null,payment=10, фрла Exception и излегува од програма

   Test case: allItems=[], payment=0 -1->3->4.1->4.2->23->24->27 празна листа резултира со непроцесирање на предмети и бидејќи payment=0, сумата се поклопува со payment што води до успешен заклучок.

   Test case: allItems[], payment=-1 -1->3->4.1->4.2->23->25->26->27 празна листа со негативно payment резултира со сума која не се поклопува со условот за payment, што предизвикува неуспех во процесот.

    Test case: allItems= [new Item("", "null", 100,0.1f)], payment=100 -1->3->4.1->4.2->5->6->7->8->19->20->27 предметот има празен stirng и вредност за баркодот "null", но не го спречуваат предметот да биде обработен.Вкупната цена се поклопува со payment.

  Test case: allItem=[new Item("","012345", 350,0.1f)], payment=100 -1->3->4.1->4.2->5->6->7->8->9->10->11.1->11.2->12->13->11.3->11.2->15->16->21->22->4.3->4.2->8->23->25->26->27, баркодот почнува со 0, и неговата цена е над 300, што предизвикува специјални услови и дополнителна логика, но на крај сумата го надминува payment,што доведува до неуспех. 

  Test case: allItems=[new Item("Item1", "12345a", 100, 0.1f)], payment=100 -1->3->4.1->4.2->5->6->8->9->10->11.1->11.2->12->13->14->27, во овој test case, имаме име и баркодот содржи буква, што предизвикува специјални услови и дополнителна логика.
    
   Test case: allItems= [newItem("Item1", "12345", 100, -1f)], payment=100 -1->3->4.1->4.2->5->6->8->9->10->11.1->11.2->12->13->11.1->11.2->15->17->18->21->4.3->4.2->23->24->27, цената е помала од 300, попустот е негативна вредност(-1f). Програмата го обработува предметот, ја проверува и додава цената во сумата.Вкупната сума(100) се поклопува со плаќањето(100) што резултира со успешно завршување на методот.

# Multiple Condition
1) 340;0.2;12345=TTF
2) 340;0;12345=TFF
3) 340;0.2;01234=TTT
4) 100;0.2;01234=FTT
