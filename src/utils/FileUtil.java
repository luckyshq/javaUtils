package utils;

import java.io.*;

/**
 * Created by zhangshengqi on 15/10/29.
 */
public class FileUtil {

	private static final String SLASH = "/";
	private static final String PERIOD = ".";

	/**
	 * 获取文件/文件夹名称(文件名不包含后缀名)
	 *
	 * @param file 要获取名称的File对象
	 * @return file为空则返回"",否则返回文件/文件夹名称
	 */
	public static String getFileName(File file) {
		if (null == file){
			return "";
		}

		if (file.isDirectory()){
			return file.getName();
		}

		int indexOfLastPeriod = file.getName().lastIndexOf(PERIOD);
		return file.getName().substring(0, indexOfLastPeriod);
	}

	/**
	 * 重命名文件
	 *
	 * @param file    要重命名的文件
	 * @param name    重命名后的文件名
	 * @param isForce true: 如果存在同名，就直接覆盖    false: 如果存在同名，直接返回false
	 * @return true: 重命名成功    false: 重命名失败
	 */
	public static boolean renameFile(File file, String name, boolean isForce) {
		if (null == file || file.isDirectory()) {
			return false;
		}

		int indexOfLastSlash = file.getAbsolutePath().lastIndexOf(SLASH);
		String dirPath = file.getAbsolutePath().substring(0, indexOfLastSlash);

		File destFile = new File(dirPath + name);
		if (destFile.exists()) {
			if (isForce) {
				destFile.delete();
			} else {
				return false;
			}
		}

		return file.renameTo(destFile);
	}


	/**
	 * 重命名文件（重名不会覆盖）
	 *
	 * @param file 要重命名的文件
	 * @param name 重命名后的文件名
	 * @return true: 重命名成功    false: 重命名失败
	 */
	public static boolean renameFile(File file, String name) {
		return renameFile(file, name, false);
	}

	/**
	 * 删除文件或文件夹(包括目录下的文件)
	 *
	 * @param filePath 要删除的文件路径
	 */
	public static void deleteFile(String filePath) {
		if (filePath == null) {
			return;
		}
		try {
			File f = new File(filePath);
			if (f.exists() && f.isDirectory()) {
				File[] delFiles = f.listFiles();
				if (delFiles != null) {
					for (int i = 0; i < delFiles.length; i++) {
						deleteFile(delFiles[i].getAbsolutePath());
					}
				}
			}
			f.delete();
		} catch (Exception e) {

		}
	}

	/**
	 * 删除文件
	 *
	 * @param filePath     要删除的文件路径
	 * @param deleteParent 是否删除父目录
	 */
	public static void deleteFile(String filePath, boolean deleteParent) {
		if (filePath == null) {
			return;
		}
		try {
			File f = new File(filePath);
			if (f.exists() && f.isDirectory()) {
				File[] delFiles = f.listFiles();
				if (delFiles != null) {
					for (int i = 0; i < delFiles.length; i++) {
						deleteFile(delFiles[i].getAbsolutePath(), deleteParent);
					}
				}
			}
			if (deleteParent) {
				f.delete();
			} else if (f.isFile()) {
				f.delete();
			}
		} catch (Exception e) {

		}
	}

	public static void copyFile(File fromFile, File toFile, Boolean rewrite) {

		if (!fromFile.exists()) {
			return;
		}

		if (!fromFile.isFile()) {
			return;
		}
		if (!fromFile.canRead()) {
			return;
		}
		if (!toFile.getParentFile().exists()) {
			toFile.getParentFile().mkdirs();
		}
		if (toFile.exists() && rewrite) {
			toFile.delete();
		}

		try {
			FileInputStream fosfrom = new FileInputStream(fromFile);
			FileOutputStream fosto = new FileOutputStream(toFile);

			byte[] bt = new byte[1024];
			int c;
			while ((c = fosfrom.read(bt)) > 0) {
				fosto.write(bt, 0, c);
			}
			//关闭输入、输出流
			fosfrom.close();
			fosto.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
