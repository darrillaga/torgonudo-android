package me.darrillaga.torgonudo.viewer.viewpendingorders.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.darrillaga.torgonudo.commons.BaseActivity;
import me.darrillaga.torgonudo.viewer.R;
import se.emilsjolander.intentbuilder.IntentBuilder;


@IntentBuilder
public class PendingDeliveryOrdersActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        PendingDeliveryOrdersActivityIntentBuilder.inject(getIntent(), this);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base);

        getSupportFragmentManager().beginTransaction()
                .replace(
                        R.id.container,
                        new PendingDeliveryOrdersFragmentBuilder().build(),
                        PendingDeliveryOrdersFragment.class.getName()
                ).commit();
    }
}
