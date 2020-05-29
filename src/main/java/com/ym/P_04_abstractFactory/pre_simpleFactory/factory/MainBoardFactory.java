package com.ym.P_04_abstractFactory.pre_simpleFactory.factory;

import com.ym.P_04_abstractFactory.pre_simpleFactory.service.MainBoardApi;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.impl.GiJiaMainBoard;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.impl.MsiMainBoard;

public class MainBoardFactory {

    public static MainBoardApi createMainBoardApi(int type) {
        MainBoardApi res = null;
        if (type == 1) {
            res = new GiJiaMainBoard(111);
        } else if (type == 2)  {
            res = new MsiMainBoard(222);
        }
        return res;
    }

}
