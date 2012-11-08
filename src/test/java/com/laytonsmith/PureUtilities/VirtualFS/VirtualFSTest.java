package com.laytonsmith.PureUtilities.VirtualFS;

import com.laytonsmith.PureUtilities.FileUtility;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lsmith
 */
public class VirtualFSTest {
	public VirtualFSTest() {
	}
	
	File root = new File("./VirtualFS");
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		root.mkdirs();
	}
	
	@After
	public void tearDown() {
		FileUtility.recursiveDelete(root);
		assertFalse(root.exists());
	}
	
	/**
	 * This test sees if the VFS starts up correctly, that is,
	 * the file system is created with all the appropriate meta
	 * files.
	 * @throws Exception 
	 */
	@Test
	public void virtualFSSetup() throws Exception{
		
	}
	
	/**
	 * This simple test sees if a file writes to the appropriate
	 * location, and can be re-read with a read call.
	 * @throws Exception 
	 */
	@Test
	public void testWriteReadWithNewFile() throws Exception{
		
	}
	
	/**
	 * This test sees if a file that is created from an outside process
	 * cannot be read, since it is not in the manifest
	 * @throws Exception 
	 */
	@Test
	public void testCordonedFileNotFound() throws Exception{
		
	}
	
	/**
	 * This test sees if writing to a file that was created from an outside
	 * process fails, since it is not in the manifest.
	 * @throws Exception 
	 */
	@Test
	public void testCordonedOffTryToWriteOverExternalFile() throws Exception{
		
	}
	
	/**
	 * This tests the trivial case where a new file is successfully
	 * created in an empty spot.
	 * @throws Exception 
	 */
	@Test
	public void testCordonedOffNewFileCreation() throws Exception{
		
	}
	
	/**
	 * This ensures that reads and writes to the meta directory always fail.
	 * @throws Exception 
	 */
	@Test
	public void testMetaFileReadWriteFails() throws Exception{
		
	}
	
	/**
	 * This ensures that symlinks work with plain local files.
	 * @throws Exception 
	 */
	@Test
	public void testSymlink() throws Exception{
		
	}
	
	/**
	 * This ensures that symlinks to a remote file system work.
	 * @throws Exception 
	 */
	@Test
	public void testSSHSymlink() throws Exception{
		
	}
	
	/**
	 * This ensures that listing files works properly
	 * @throws Exception 
	 */
	@Test
	public void testList() throws Exception{
		
	}
	
	/**
	 * This ensures file deletion works.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception{
		
	}
	
	/**
	 * Ensures file existance checking works.
	 * @throws Exception 
	 */
	@Test
	public void testExists() throws Exception{
		
	}
	
	/**
	 * Tests isAbsolute
	 * @throws Exception 
	 */
	@Test
	public void testIsAbsolute() throws Exception{
		
	}
	
	/**
	 * Tests isDirectory
	 * @throws Exception 
	 */
	@Test
	public void testIsDirectory() throws Exception{
		
	}
	
	/**
	 * Tests isFile
	 * @throws Exception 
	 */
	@Test
	public void testIsFile() throws Exception{
		
	}
	
	/**
	 * Tests mkdirs
	 * @throws Exception 
	 */
	@Test
	public void testMkDirs() throws Exception{
		
	}
	
	/**
	 * Tests mkdir
	 * @throws Exception 
	 */
	@Test
	public void testMkDir() throws Exception{
		
	}
	
	/**
	 * Tests creating an empty file
	 * @throws Exception 
	 */
	@Test
	public void testCreateEmptyFile() throws Exception{
		
	}
	
	/**
	 * Tests creating a temp file.
	 * @throws Exception 
	 */
	@Test
	public void testCreateTmpFile() throws Exception{
		
	}
	
	/**
	 * Ensures that a folder that is hidden will not show up
	 * @throws Exception 
	 */
	@Test
	public void testHiddenFileNotShowing() throws Exception{
		
	}
	
	/**
	 * Ensures that quotas cannot be exceeded
	 * @throws Exception 
	 */
	@Test
	public void testQuota() throws Exception{
		
	}
	
	/**
	 * Ensures that a read only file cannot be written to
	 * @throws Exception 
	 */
	@Test
	public void testReadOnly() throws Exception{
		
	}
	
	/**
	 * Ensures that folder depth cannot be exceeded if a
	 * restriction is in place.
	 * @throws Exception 
	 */
	@Test
	public void testFolderDepth() throws Exception{
		
	}
	
	/**
	 * Ensures globs match correctly
	 * @throws Exception 
	 */
	@Test
	public void testGlobMatching() throws Exception{
		
	}

}