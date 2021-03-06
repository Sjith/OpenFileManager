package org.linuxmotion.filemanager.preferences;

import org.linuxmotion.filemanager.utils.Constants;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtils {
	
	/*
	 * 
	 * Prefernces releted to exiting the application
	 * 
	 */
	
	   public static void resetExitStatus(Context context){
	    	
	    	
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.ABOUT_TO_EXIT, false);
			edit.commit();
	    	
	    	
	    }
	   
	    public static void setExitStatus(Context context) {
			
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.ABOUT_TO_EXIT, true);
			edit.commit();
			
		}
	    
	    
	   /*
	    * 
	    * File and folder sorting preferences
	    * 
	    */
	    
	    /************************/
	    public static boolean retreiveShowHideHiddenFilesFoldersPref(Context context){
			
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			return prefs.getBoolean(Constants.HIDDEN_FILES_FOLDERS_PREF, true);
				
			
		}
	    
	    
	    public static void hideHiddenFilesFolders(Context context){
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.HIDDEN_FILES_FOLDERS_PREF, false);
			edit.commit();
	    	
	    }

	    public static void showHiddenFilesFolders(Context context){
	    	
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.HIDDEN_FILES_FOLDERS_PREF, true);
			edit.commit();
	    }
	    

	    /************************/
	    public static boolean retreiveSortbyFoldersFilesPref(Context context){
			
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			return prefs.getBoolean(Constants.SORT_BY_FOLDERS_FILES_PREF, true);
				
			
		}
	    
	    
		public static void sortFoldersFiles(Context context){
			
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.SORT_BY_FOLDERS_FILES_PREF, true);
			edit.commit();
			
		}
		
		public static void sortFilesFolders(Context context){
			
	    	SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.SORT_BY_FOLDERS_FILES_PREF, false);
			edit.commit();
			
		}

		public static void sortLexicographicallySmallerFirst(Context context, boolean smallerFirst) {
			
			SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			SharedPreferences.Editor edit = prefs.edit();
			edit.putBoolean(Constants.SORT_LEXICOGRAPHICALLY_SMALLER_FIRST_PREF, smallerFirst);
			edit.commit();
			
			
		}

		public static boolean retreiveLexicographicallySmallerFirst(Context context) {
			SharedPreferences prefs = context.getSharedPreferences(Constants.OPEN_FILE_MANAGER_PREFERENCES, 0);
			return prefs.getBoolean(Constants.SORT_LEXICOGRAPHICALLY_SMALLER_FIRST_PREF, true);
				
		}


	    /************************/

}
