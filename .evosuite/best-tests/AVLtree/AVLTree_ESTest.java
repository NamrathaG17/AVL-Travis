/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 11 13:44:07 GMT 2022
 */

package AVLtree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import AVLtree.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(102);
      aVLTree0.delete(102);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(1);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.left = aVLTree_Node0;
      aVLTree_Node0.right = aVLTree_Node1.left;
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      int int0 = (-2471);
      aVLTree0.insert(1605);
      aVLTree0.delete((-2471));
      int int1 = (-854);
      aVLTree0.delete((-854));
      int int2 = 228;
      aVLTree0.insert(228);
      aVLTree0.delete((-2471));
      aVLTree0.insert((-2471));
      aVLTree0.delete(0);
      int int3 = 0;
      aVLTree0.insert(0);
      aVLTree0.delete(228);
      aVLTree0.delete(228);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1500));
      aVLTree0.insert((-311));
      aVLTree0.find((-1838));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
      
      int int1 = 0;
      aVLTree0.insert((-1));
      aVLTree0.insert(1339);
      aVLTree0.insert(0);
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.insert(1339);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(2589);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1317;
      aVLTree0.delete(1317);
      aVLTree0.insert(1317);
      aVLTree0.insert(1);
      int int1 = 0;
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      int int2 = 9;
      aVLTree0.delete(9);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.left = aVLTree_Node0;
      int int3 = 1;
      // Undeclared exception!
      try { 
        aVLTree0.delete(int3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-4931);
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-4931));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      AVLTree.Node aVLTree_Node2 = aVLTree_Node0.right;
      aVLTree_Node0.right = aVLTree_Node2;
      aVLTree0.height();
      AVLTree.Node aVLTree_Node3 = aVLTree0.find((-1));
      aVLTree_Node3.right = aVLTree_Node0;
      aVLTree_Node3.height = 0;
      aVLTree_Node0.left = aVLTree_Node3;
      aVLTree_Node0.right = aVLTree_Node2;
      aVLTree_Node0.right.left = aVLTree_Node2;
      aVLTree0.insert(int0);
      int int1 = 0;
      aVLTree0.delete(int1);
      aVLTree0.getBalance(aVLTree_Node0);
      int int2 = (-1315);
      aVLTree0.find(int2);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1248));
      int int0 = (-964);
      aVLTree0.insert((-964));
      aVLTree0.insert((-978));
      aVLTree0.insert((-1248));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree aVLTree1 = new AVLTree();
      aVLTree1.insert((-978));
      AVLTree.Node aVLTree_Node1 = aVLTree1.new Node((-1248));
      aVLTree_Node0.right = aVLTree_Node1;
      AVLTree.Node aVLTree_Node2 = aVLTree1.getRoot();
      aVLTree_Node0.right = aVLTree_Node2;
      aVLTree0.getRoot();
      aVLTree_Node0.right.height = (-1);
      aVLTree_Node0.right.height = 117;
      aVLTree_Node0.key = (-964);
      // Undeclared exception!
      try { 
        aVLTree0.delete((-1248));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-16));
      aVLTree0.delete(0);
      aVLTree0.delete((-4051));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-16));
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete(0);
      aVLTree0.delete(2050);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.height();
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      // Undeclared exception!
      aVLTree0.find(2050);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-201));
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-201));
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-201));
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-201));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2286));
      aVLTree0.getRoot();
      aVLTree0.insert(3443);
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2552);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert((-2130));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      aVLTree0.delete((-1));
      int int0 = aVLTree0.height();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.insert(1822);
      aVLTree0.delete((-1066));
      aVLTree0.delete(1822);
      aVLTree0.insert((-1155));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree_Node0.key = 0;
      aVLTree0.delete(0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert((-1066));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1510));
      aVLTree0.insert(1589);
      aVLTree0.insert(3466);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1589);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(579);
      aVLTree0.delete(579);
      aVLTree0.insert(579);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert((-1000));
      aVLTree0.delete(1);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(801);
      aVLTree0.delete((-2257));
      // Undeclared exception!
      try { 
        aVLTree0.insert(801);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2052));
      aVLTree0.insert((-622));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(97);
      aVLTree0.insert((-2012));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.find(0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(4924);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-117));
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1580);
      aVLTree0.insert(422);
      aVLTree0.insert((-2445));
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.delete(422);
      aVLTree0.insert(422);
      aVLTree0.delete(0);
      aVLTree0.insert((-1451));
      aVLTree0.find((-2445));
      aVLTree0.insert(0);
      aVLTree0.find(1);
      assertEquals(2, aVLTree0.height());
  }
}
