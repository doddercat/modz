package com.modz.entry;

import android.view.View;
import android.widget.Toast;

import com.dodder.box.p.Plugin;

import b.c.a.CallbackListenser;
import b.c.a.ChatSDKEntry;
import b.c.a.GiftLevel;
import b.c.a.WidgetType;


public class Entry extends Plugin {

    @Override
    public boolean OnPluginCreate() {
        try {
            ChatSDKEntry.getInstance().initChatSDK(this, "");
            ChatSDKEntry.getInstance().registerMenu(context, R.string.base, WidgetType.CharView);
            ChatSDKEntry.getInstance().registerFunction("a", R.string.test1, R.string.test1, WidgetType.CheckBox, GiftLevel.gift4);
            ChatSDKEntry.getInstance().registerFunction("b", R.string.test2, R.string.test2, WidgetType.CheckBox, GiftLevel.gift2);
            ChatSDKEntry.getInstance().registerFunction("c", R.string.test3, R.string.test3, WidgetType.CheckBox,null);
            ChatSDKEntry.getInstance().registerFunction("d", R.string.test4, R.string.test4, WidgetType.Btn,null);
            ChatSDKEntry.getInstance().setFunctionOnClickListener(new CallbackListenser() {
                @Override
                public boolean OnClick(String id, int value, Object o) {

                    switch (id) {
                        case "c":
                            Toast.makeText(getContext(), ":" + id, Toast.LENGTH_LONG).show();
                            break;

                        case "d":
                            Toast.makeText(getContext(), ":" + id, Toast.LENGTH_LONG).show();

                            break;
                    }
                    return true;
                }

                @Override
                public View getSelfView(Object o) {
                    return null;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
