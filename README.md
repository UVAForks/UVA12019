# UVA12019

解題技巧:日期時間

Time類別包合了轉換與計算答案
其中
```
    static String[] week 
    static int[] months
    static int start = 5;//剛開始是星期五令5為初始
```
week存取星期而Month負責月日數
如此一來我們只要把時間訂好2011/1/1是星期幾我們就能推算其他時間

如何轉換?
```
static int _convert(int month, int day)
    {
        int days = day;
        for(int i = 0; i < month-1; i++)//因為1/1是周5 然而我們只需把迴圈定位到每個日期到相應的陣列之中
            days += months[i];
        return days;
    }
```

輸入和呼叫方式
```
int n = sc.nextInt();
        while(n-- > 0)
        {
           System.out.println(Time.get_week(sc.nextInt(), sc.nextInt()));
        }
```
