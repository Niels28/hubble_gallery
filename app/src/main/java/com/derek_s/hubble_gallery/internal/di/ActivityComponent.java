package com.derek_s.hubble_gallery.internal.di;

import com.derek_s.hubble_gallery.act_main.ActMain;
import com.derek_s.hubble_gallery.base.ActBase;
import com.derek_s.hubble_gallery.base.FragBase;
import com.derek_s.hubble_gallery.ui.activities.ActDetails;
import com.derek_s.hubble_gallery.ui.activities.ActImageViewer;
import com.derek_s.hubble_gallery.ui.activities.ActWelcome;

import dagger.Component;

/**
 * This component injects Activities and Fragments
 */

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface ActivityComponent {

  void inject(ActBase app);

  void inject(ActDetails app);

  void inject(ActMain app);

  void inject(ActImageViewer app);

  void inject(ActWelcome app);

  void inject(FragBase app);
}
