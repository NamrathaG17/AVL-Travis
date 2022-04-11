/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 11 12:54:08 GMT 2022
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
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1543;
      aVLTree0.insert(1543);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1543);
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
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
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
      aVLTree0.insert((-4931));
      int int0 = 0;
      aVLTree0.delete(int0);
      aVLTree0.getBalance(aVLTree_Node0);
      int int1 = (-1315);
      aVLTree0.find(int1);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find((-117));
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
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1));
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.insert(2836);
      aVLTree0.insert(2866);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 2835;
      aVLTree0.delete(2835);
      aVLTree0.insert(2835);
      // Undeclared exception!
      try { 
        aVLTree0.insert(2835);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLtree.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.delete((-1));
      aVLTree0.height();
      aVLTree0.insert((-1));
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.insert(1239);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      aVLTree0.find((-1));
      aVLTree0.height();
      aVLTree0.insert((-980));
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.delete(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1605);
      aVLTree0.delete((-854));
      aVLTree0.insert(228);
      aVLTree0.delete((-2471));
      aVLTree0.insert((-2471));
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.delete(228);
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      aVLTree0.insert((-1427));
      aVLTree0.delete((-2471));
      aVLTree0.height();
      aVLTree0.find((-2471));
      aVLTree0.getRoot();
      aVLTree0.find(228);
      aVLTree0.delete((-854));
      aVLTree0.find(1);
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.find(1);
      aVLTree0.find((-485));
      aVLTree0.find(1);
      assertEquals(2, aVLTree0.height());
  }
}
