package com.priyanka.patel.Utils

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Build
import android.provider.Settings
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import com.priyanka.patel.ApplicationClass
import com.priyanka.patel.R
import com.google.android.material.snackbar.Snackbar
import java.text.SimpleDateFormat

class Utils {

    companion object {

        val connectivityManager: ConnectivityManager =
            ApplicationClass.mInstance!!.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager


        fun isOnline(context: Activity, message: Boolean): Boolean {
            val mConnectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = mConnectivityManager.activeNetworkInfo
            if (netInfo != null) {
                if (netInfo.isConnected) {
                    return true
                }
            }
            if (message) {
                val dialog = AlertDialog.Builder(context)
                dialog.setTitle(context.getString(R.string.app_name))
                dialog.setCancelable(false)
                dialog.setMessage(context.getString(R.string.check_connection))
                dialog.setPositiveButton(context.getString(R.string.settings)) { dialog, id ->
                    dialog.dismiss()
                    context.startActivity(Intent(Settings.ACTION_SETTINGS))
                }
                dialog.setNegativeButton(context.getString(android.R.string.cancel)) { dialog, id -> dialog.dismiss() }
                //dialog.show();

                return false
            }
            return false
        }


        fun getDeviceResolution(activity: Activity?): DisplayMetrics {
            val displaymatrics = DisplayMetrics()
            activity?.windowManager?.defaultDisplay?.getMetrics(displaymatrics)
            return displaymatrics
        }

        fun isValidEmail(inputmail: CharSequence): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(inputmail).matches()
        }

        fun hideKeyboard(context: Activity) {
            val inputMethodManager =
                context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(
                context.currentFocus?.windowToken,
                InputMethodManager.HIDE_IMPLICIT_ONLY
            )
        }

        fun snackBar(view: View, msg: String, isSnackBar: Boolean, context: Context?) {
            try {
                if (isSnackBar) {
                    val snackBar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG)
                    snackBar.view.setBackgroundColor(Color.parseColor("#7450C9"))
                    snackBar.show()
                } else {
                    Toast.makeText(context, "$msg", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun checkPermissionForLocation(activity: Activity): Boolean {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                if (activity.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) ==
                    PackageManager.PERMISSION_GRANTED) {
                    true
                } else {
                    // Show the permission request
                    ActivityCompat.requestPermissions(activity, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                        15)
                    false
                }
            } else {
                true
            }
        }

        fun checkPermitionGallaryCamera(context: Activity?) {
            context?.let {
                requestPermissions(
                    it, arrayOf(
                        Manifest.permission.CAMERA,
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                    ), 1
                )
            }

        }

        fun milliSecondsToTimer(milliseconds: Long): String? {
            var finalTimerString = ""
            var secondsString = ""

            // Convert total duration into time
            val hours = (milliseconds / (1000 * 60 * 60)).toInt()
            val minutes = (milliseconds % (1000 * 60 * 60)).toInt() / (1000 * 60)
            val seconds = (milliseconds % (1000 * 60 * 60) % (1000 * 60) / 1000).toInt()
            // Add hours if there
            if (hours > 0) {
                finalTimerString = "$hours:"
            }

            // Prepending 0 to seconds if it is one digit
            secondsString = if (seconds < 10) {
                "0$seconds"
            } else {
                "" + seconds
            }
            finalTimerString = "$finalTimerString$minutes:$secondsString"

            // return timer string
            return finalTimerString
        }

        /**
         * Function to get Progress percentage
         * @param currentDuration
         * @param totalDuration
         */
        fun getProgressPercentage(currentDuration: Long, totalDuration: Long): Int {
            var percentage = 0.toDouble()
            val currentSeconds: Long = (currentDuration / 1000).toLong()
            val totalSeconds: Long = (totalDuration / 1000).toLong()

            // calculating percentage
            percentage = currentSeconds.toDouble() / totalSeconds * 100

            // return percentage
            return percentage.toInt()
        }

        /**
         * Function to change progress to timer
         * @param progress -
         * @param totalDuration
         * returns current duration in milliseconds
         */
        fun progressToTimer(progress: Int, totalDuration: Int): Int {
            var totalDuration = totalDuration
            var currentDuration = 0
            totalDuration = (totalDuration / 1000)
            currentDuration = (progress.toDouble() / 100 * totalDuration).toInt()

            // return current duration in milliseconds
            return currentDuration * 1000
        }

        fun changeDateFormate(timer: String, toFormat: String, fromdate: String): String {
            val datesource = SimpleDateFormat(toFormat)
            val date = datesource.parse(timer)
            val datedestination = SimpleDateFormat(fromdate)
            return datedestination.format(date)
        }


    }

    fun hideKeyboard(mContext: Context) {
        val inputManager =
            mContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        val focus = (mContext as Activity).currentFocus

        if (focus != null) {

            inputManager.hideSoftInputFromWindow(
                focus.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            )
        }
    }

    fun hideKeyboardWithDialog(mContext: Context) {
        val inputManager =
            mContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        val focus = (mContext as Activity).currentFocus

        if (focus != null) {
            inputManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
        }

    }


    fun hideSoftKeyboardWhenNeeded(activity: Activity) {
        val inputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        if (inputMethodManager.isActive) {
            if (activity.currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(
                    activity.currentFocus!!.windowToken,
                    InputMethodManager.HIDE_NOT_ALWAYS
                )
            }
        }
    }
    fun snackbar(view: View, msg: String, isSnakbar: Boolean, mContext: Context) {

        try {
            if (isSnakbar) {
                val snack = Snackbar.make(view, msg, Snackbar.LENGTH_LONG)
                snack.view.setBackgroundColor(Color.parseColor("#F0627E"))
                val viewNew = snack.view
                val tv = viewNew.findViewById<View>(R.id.snackbar_text) as TextView
                tv.gravity = Gravity.CENTER_HORIZONTAL
                snack.show()
            } else {
                Toast.makeText(mContext, "" + msg, Toast.LENGTH_LONG).show()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }


    fun addNextFragment(
        mActivity: Activity,
        targetedFragment: androidx.fragment.app.Fragment,
        shooterFragment: androidx.fragment.app.Fragment,
        isDownToUp: Boolean
    ) {
        val transaction=ApplicationClass.getmInstance()!!.getactivity()!!.supportFragmentManager.beginTransaction()


        if (isDownToUp) {
            transaction.setCustomAnimations(
                R.animator.slide_fragment_vertical_right_in,
                R.animator.slide_fragment_vertical_left_out,
                R.animator.slide_fragment_vertical_left_in,
                R.animator.slide_fragment_vertical_right_out
            )

            //FragmentTransactionExtended fragmentTransactionExtended = new FragmentTransactionExtended(mActivity, transaction, shooterFragment, targetedFragment, R.id.activity_menubar_containers);
            //fragmentTransactionExtended.addTransition(FragmentTransactionExtended.SLIDE_VERTICAL);

        } else {
            transaction.setCustomAnimations(
                R.animator.slide_fragment_horizontal_right_in,
                R.animator.slide_fragment_horizontal_left_out,
                R.animator.slide_fragment_horizontal_left_in,
                R.animator.slide_fragment_horizontal_right_out
            )

            //FragmentTransactionExtended fragmentTransactionExtended = new FragmentTransactionExtended(mActivity, transaction, shooterFragment, targetedFragment, R.id.activity_menubar_containers);
            //fragmentTransactionExtended.addTransition(FragmentTransactionExtended.SLIDE_HORIZONTAL);
        }


        transaction.add(
            //R.id.framelayout,
            targetedFragment,
            targetedFragment.javaClass.getSimpleName()
        );
        //curFragment = targetedFragment;
        transaction.hide(shooterFragment)
        transaction.addToBackStack(targetedFragment.javaClass.simpleName)
        transaction.commit()
    }



}