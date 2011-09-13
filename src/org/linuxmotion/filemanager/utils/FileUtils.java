/*
 *    This file is part of openFileManager.
 *
 *    openFileManager is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    openFileManager is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.*
 *
 *    You should have received a copy of the GNU General Public License
 *    along with openFileManager.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.linuxmotion.filemanager.utils;

import java.io.File;

import android.util.Log;

public class FileUtils {
	private static String TAG = FileUtils.class.getCanonicalName();
	
	
	
	
	public static File[] getFilesInDirectory(String directory){
		
		
		File temp = new File(directory);
		if(temp.exists()){
			
			Log.d("FileUtils", "Path exists");
			if(temp.listFiles() != null){
				return temp.listFiles();
			}
			else {
				// If this point is reached then the directory doesnt contain any 
				// files
				Log.d(TAG, "the directory is empty, or not accessible");
				return null;
			}
			
		}
		else {
			Log.d(TAG, "Sdcard directory in not present");
			return null;
		}
	} 
	
	
	
	public static boolean hasExtension(String filename){
		
		log("Filename: " + filename);
		char[] tfile = filename.toCharArray();
		for(int i = tfile.length-1; i >= 0 ; i--){
			
			if(tfile[i] == '.' && i != 0){
				log("File extension found");
				return true;
				
			}
			
		}
		
		log("Does not have an extension");
		return false;
			
		
	}
	
	private static void log(String message){
		
		Log.d(TAG, message);
		
	}
	

	
}