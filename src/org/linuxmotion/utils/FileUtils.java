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
package org.linuxmotion.utils;

import java.io.File;

import org.linuxmotion.R;
import org.linuxmotion.utils.Constants.FileType;

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
	
	
	public static FileType checkFileExtension(File file){
		
		 
		 String name = file.getName();
		 
		 String[] name_extension = name.split("\\.",2);
		 
		 log("Name: "+ name_extension[0] + " \n Extension: " + name_extension[1]);
		 
		 if(name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".gif")){
			 log("file type is a picture");
			 return FileType.IMAGE;
			 
		 }else if(name.endsWith(".doc") || name.endsWith(".docx") || name.endsWith(".odf")){

			 log("File type is a document");
			 return FileType.DOCUMENT;
			 
		 }else if(name.endsWith(".avi") || name.endsWith(".mp4")){
			 
			 log("File type is a video");
			 return FileType.VIDEO;
			 
		 }
		 
		 return FileType.UNKNOWN;
		
		
		
		
		
		
		
	}
	
	private static void log(String message){
		
		Log.d(TAG, message);
		
	}
	

	
}
