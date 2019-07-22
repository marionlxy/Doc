#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.widget.Toast;

#parse("File Header.java")

public class ToastUtils {
    private static Toast sToast = null;

    public static void show(Context context, String text) {
        showText(context, text, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, String text, int duration) {
        showText(context, text, duration);
    }

    public static void show(Context context, int textId) {
        showText(context, context.getText(textId).toString(), Toast.LENGTH_SHORT);
    }

    public static void show(Context context, int textId, int duration) {
        showText(context, context.getText(textId).toString(), duration);
    }

    private static void showText(Context context, String text, int dutation) {
        if (sToast == null) {
            sToast = Toast.makeText(context, text, dutation);
        }
        sToast.setText(text);
        sToast.setDuration(dutation);
        sToast.show();
    }
}
