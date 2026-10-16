package com.wilson8872.footballanalysiselitemini;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(float value) {
        return (int) (value * getResources()
                .getDisplayMetrics().density);
    }

    private TextView makeText(String text, int size) {
        TextView view = new TextView(this);
        view.setText(text);
        view.setTextSize(size);
        view.setTextColor(Color.WHITE);
        view.setGravity(Gravity.CENTER);
        return view;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.rgb(15, 45, 35));
        getWindow().setNavigationBarColor(Color.rgb(15, 45, 35));

        LinearLayout screen = new LinearLayout(this);
        screen.setOrientation(LinearLayout.VERTICAL);
        screen.setGravity(Gravity.CENTER);
        screen.setPadding(dp(24), dp(24), dp(24), dp(24));
        screen.setBackgroundColor(Color.rgb(10, 28, 23));

        TextView title = makeText("FOOTBALL ANALYSIS", 26);
        title.setTypeface(null, 1);
        screen.addView(title);

        TextView subtitle = makeText(
                "ELITE MINI | VERSION 1.0", 14);
        subtitle.setPadding(0, dp(8), 0, dp(28));
        screen.addView(subtitle);

        addSection(screen, "MATCHES",
                "Manage matches and predictions");

        addSection(screen, "ANALYSIS",
                "Review predictions and odds");

        addSection(screen, "HISTORY",
                "Track results and prediction records");

        addSection(screen, "SYNCHRONIZATION",
                "Online connection: Not configured yet");

        TextView footer = makeText(
                "Your football analysis companion", 13);
        footer.setPadding(0, dp(28), 0, 0);
        screen.addView(footer);

        setContentView(screen);
    }

    private void addSection(LinearLayout parent,
                            String heading, String description) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(dp(16), dp(12), dp(16), dp(12));
        card.setBackgroundColor(Color.rgb(25, 53, 43));

        TextView title = makeText(heading, 18);
        title.setTypeface(null, 1);
        card.addView(title);

        TextView detail = makeText(description, 13);
        detail.setPadding(0, dp(6), 0, 0);
        card.addView(detail);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(0, dp(7), 0, dp(7));
        parent.addView(card, params);
    }
          }
