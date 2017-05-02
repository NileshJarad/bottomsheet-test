package com.simplecityapps.navigation.fragment;

import com.simplecityapps.navigation.base.NavigationController;

/**
 * Classes which are capable of handling the Android back-button press (such as {@link android.app.Activity})
 * should implement this method to allow back-presses to be propagated to the NavigationController, which then
 * gets an opportunity to consume the back press event via {@link NavigationController#consumeBackPress()}
 *
 * @see {@link BaseNavigationController#onResume()}
 */
public interface BackPressHandler {
    void setBackPressListener(NavigationController listener);
}
