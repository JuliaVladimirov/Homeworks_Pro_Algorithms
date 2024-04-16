package org.example.alg_homework_2024_04_15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(Activity::getPrice).thenComparing(Activity::getFinish).thenComparing(Activity::getStart));
        List<Activity> res = new ArrayList<>();
        print(list);

        System.out.println("--------------------");

//  Обрабатывать список буду с конца, поскольку во второй половине списка время дороже.

        Activity last = list.get(list.size() - 1);
        int first = last.getStart(); // предыдущее свободное время
        res.add(last);


        for(int i = list.size() - 2; i > -1; i--) {
            if(list.get(i).getFinish() <= first) {
                first = list.get(i).getStart();
                res.add(list.get(i));
            }
        }

        print(res);
    }

    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.getName() + "  " + e.getStart() + "->" + e.getFinish() + " - price: " + e.getPrice());
        }
    }
}
