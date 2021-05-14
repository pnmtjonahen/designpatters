/*
 * Copyright  2002 Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * California 95054, U.S.A. All rights reserved.  Sun Microsystems, Inc. has
 * intellectual property rights relating to technology embodied in the product
 * that is described in this document. In particular, and without limitation,
 * these intellectual property rights may include one or more of the U.S.
 * patents listed at http://www.sun.com/patents and one or more additional
 * patents or pending patent applications in the U.S. and in other countries.
 * U.S. Government Rights - Commercial software. Government users are subject
 * to the Sun Microsystems, Inc. standard license agreement and applicable
 * provisions of the FAR and its supplements.  Use is subject to license terms.
 * Sun,  Sun Microsystems,  the Sun logo and  Java are trademarks or registered
 * trademarks of Sun Microsystems, Inc. in the U.S. and other countries.  This
 * product is covered and controlled by U.S. Export Control laws and may be
 * subject to the export or import laws in other countries.  Nuclear, missile,
 * chemical biological weapons or nuclear maritime end uses or end users,
 * whether direct or indirect, are strictly prohibited.  Export or reexport
 * to countries subject to U.S. embargo or to entities identified on U.S.
 * export exclusion lists, including, but not limited to, the denied persons
 * and specially designated nationals lists is strictly prohibited.
 */

package nl.tjonahen.javacompiler;

import java.io.PrintStream;
import nl.tjonahen.javacompiler.parser.ASTAdditiveExpression;
import nl.tjonahen.javacompiler.parser.ASTAllocationExpression;
import nl.tjonahen.javacompiler.parser.ASTAndExpression;
import nl.tjonahen.javacompiler.parser.ASTArgumentList;
import nl.tjonahen.javacompiler.parser.ASTArguments;
import nl.tjonahen.javacompiler.parser.ASTArrayDimsAndInits;
import nl.tjonahen.javacompiler.parser.ASTArrayInitializer;
import nl.tjonahen.javacompiler.parser.ASTAssignmentOperator;
import nl.tjonahen.javacompiler.parser.ASTBlock;
import nl.tjonahen.javacompiler.parser.ASTBlockStatement;
import nl.tjonahen.javacompiler.parser.ASTBooleanLiteral;
import nl.tjonahen.javacompiler.parser.ASTBreakStatement;
import nl.tjonahen.javacompiler.parser.ASTCastExpression;
import nl.tjonahen.javacompiler.parser.ASTCastLookahead;
import nl.tjonahen.javacompiler.parser.ASTClassBody;
import nl.tjonahen.javacompiler.parser.ASTClassBodyDeclaration;
import nl.tjonahen.javacompiler.parser.ASTClassDeclaration;
import nl.tjonahen.javacompiler.parser.ASTCompilationUnit;
import nl.tjonahen.javacompiler.parser.ASTConditionalAndExpression;
import nl.tjonahen.javacompiler.parser.ASTConditionalExpression;
import nl.tjonahen.javacompiler.parser.ASTConditionalOrExpression;
import nl.tjonahen.javacompiler.parser.ASTConstructorDeclaration;
import nl.tjonahen.javacompiler.parser.ASTContinueStatement;
import nl.tjonahen.javacompiler.parser.ASTDoStatement;
import nl.tjonahen.javacompiler.parser.ASTEmptyStatement;
import nl.tjonahen.javacompiler.parser.ASTEqualityExpression;
import nl.tjonahen.javacompiler.parser.ASTExclusiveOrExpression;
import nl.tjonahen.javacompiler.parser.ASTExplicitConstructorInvocation;
import nl.tjonahen.javacompiler.parser.ASTExpression;
import nl.tjonahen.javacompiler.parser.ASTFieldDeclaration;
import nl.tjonahen.javacompiler.parser.ASTForInit;
import nl.tjonahen.javacompiler.parser.ASTForStatement;
import nl.tjonahen.javacompiler.parser.ASTForUpdate;
import nl.tjonahen.javacompiler.parser.ASTFormalParameter;
import nl.tjonahen.javacompiler.parser.ASTFormalParameters;
import nl.tjonahen.javacompiler.parser.ASTIfStatement;
import nl.tjonahen.javacompiler.parser.ASTImportDeclaration;
import nl.tjonahen.javacompiler.parser.ASTInclusiveOrExpression;
import nl.tjonahen.javacompiler.parser.ASTInitializer;
import nl.tjonahen.javacompiler.parser.ASTInstanceOfExpression;
import nl.tjonahen.javacompiler.parser.ASTInterfaceDeclaration;
import nl.tjonahen.javacompiler.parser.ASTInterfaceMemberDeclaration;
import nl.tjonahen.javacompiler.parser.ASTLabeledStatement;
import nl.tjonahen.javacompiler.parser.ASTLiteral;
import nl.tjonahen.javacompiler.parser.ASTLocalVariableDeclaration;
import nl.tjonahen.javacompiler.parser.ASTMethodDeclaration;
import nl.tjonahen.javacompiler.parser.ASTMethodDeclarationLookahead;
import nl.tjonahen.javacompiler.parser.ASTMethodDeclarator;
import nl.tjonahen.javacompiler.parser.ASTMultiplicativeExpression;
import nl.tjonahen.javacompiler.parser.ASTName;
import nl.tjonahen.javacompiler.parser.ASTNameList;
import nl.tjonahen.javacompiler.parser.ASTNestedClassDeclaration;
import nl.tjonahen.javacompiler.parser.ASTNestedInterfaceDeclaration;
import nl.tjonahen.javacompiler.parser.ASTNullLiteral;
import nl.tjonahen.javacompiler.parser.ASTPackageDeclaration;
import nl.tjonahen.javacompiler.parser.ASTPostfixExpression;
import nl.tjonahen.javacompiler.parser.ASTPreDecrementExpression;
import nl.tjonahen.javacompiler.parser.ASTPreIncrementExpression;
import nl.tjonahen.javacompiler.parser.ASTPrimaryExpression;
import nl.tjonahen.javacompiler.parser.ASTPrimaryPrefix;
import nl.tjonahen.javacompiler.parser.ASTPrimarySuffix;
import nl.tjonahen.javacompiler.parser.ASTPrimitiveType;
import nl.tjonahen.javacompiler.parser.ASTRelationalExpression;
import nl.tjonahen.javacompiler.parser.ASTResultType;
import nl.tjonahen.javacompiler.parser.ASTReturnStatement;
import nl.tjonahen.javacompiler.parser.ASTShiftExpression;
import nl.tjonahen.javacompiler.parser.ASTStatement;
import nl.tjonahen.javacompiler.parser.ASTStatementExpression;
import nl.tjonahen.javacompiler.parser.ASTStatementExpressionList;
import nl.tjonahen.javacompiler.parser.ASTSwitchLabel;
import nl.tjonahen.javacompiler.parser.ASTSwitchStatement;
import nl.tjonahen.javacompiler.parser.ASTSynchronizedStatement;
import nl.tjonahen.javacompiler.parser.ASTThrowStatement;
import nl.tjonahen.javacompiler.parser.ASTTryStatement;
import nl.tjonahen.javacompiler.parser.ASTType;
import nl.tjonahen.javacompiler.parser.ASTTypeDeclaration;
import nl.tjonahen.javacompiler.parser.ASTUnaryExpression;
import nl.tjonahen.javacompiler.parser.ASTUnaryExpressionNotPlusMinus;
import nl.tjonahen.javacompiler.parser.ASTUnmodifiedClassDeclaration;
import nl.tjonahen.javacompiler.parser.ASTUnmodifiedInterfaceDeclaration;
import nl.tjonahen.javacompiler.parser.ASTVariableDeclarator;
import nl.tjonahen.javacompiler.parser.ASTVariableDeclaratorId;
import nl.tjonahen.javacompiler.parser.ASTVariableInitializer;
import nl.tjonahen.javacompiler.parser.ASTWhileStatement;
import nl.tjonahen.javacompiler.parser.JavaParserVisitor;
import nl.tjonahen.javacompiler.parser.SimpleNode;
import nl.tjonahen.javacompiler.parser.Token;

public class UnparseVisitor implements JavaParserVisitor {

  protected PrintStream out;

  public UnparseVisitor(PrintStream o) {
    out = o;
  }

  public Object print(SimpleNode node, Object data) {
    Token t = new Token();

    SimpleNode n;
    for (int ord = 0; ord < node.jjtGetNumChildren(); ord++) {
      n = (SimpleNode) node.jjtGetChild(ord);
      while (t != null) {
        t = t.next;
        print(t);
      }
      n.jjtAccept(this, data);
    }

    return data;
  }

  protected void print(Token t) {
    if (t == null) return;
    Token tt = t.specialToken;
    if (tt != null) {
      while (tt.specialToken != null) tt = tt.specialToken;
      while (tt != null) {
        out.print(addUnicodeEscapes(tt.image));
        tt = tt.next;
      }
    }
    out.print(addUnicodeEscapes(t.image));
  }

  private String addUnicodeEscapes(String str) {
    String retval = "";
    char ch;
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      if ((ch < 0x20 || ch > 0x7e) && ch != '\t' && ch != '\n' && ch != '\r' && ch != '\f') {
        String s = "0000" + Integer.toString(ch, 16);
        retval += "\\u" + s.substring(s.length() - 4, s.length());
      } else {
        retval += ch;
      }
    }
    return retval;
  }

  @Override
  public Object visit(SimpleNode node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTCompilationUnit node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPackageDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTImportDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTTypeDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTClassDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTUnmodifiedClassDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTClassBody node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTNestedClassDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTClassBodyDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTMethodDeclarationLookahead node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTInterfaceDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTNestedInterfaceDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTUnmodifiedInterfaceDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTInterfaceMemberDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTFieldDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTVariableDeclarator node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTVariableDeclaratorId node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTVariableInitializer node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTArrayInitializer node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTMethodDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTMethodDeclarator node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTFormalParameters node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTFormalParameter node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTConstructorDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTExplicitConstructorInvocation node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTInitializer node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTType node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPrimitiveType node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTResultType node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTName node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTNameList node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTAssignmentOperator node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTConditionalExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTConditionalOrExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTConditionalAndExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTInclusiveOrExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTExclusiveOrExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTAndExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTEqualityExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTInstanceOfExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTRelationalExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTShiftExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTAdditiveExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTMultiplicativeExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTUnaryExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPreIncrementExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPreDecrementExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTUnaryExpressionNotPlusMinus node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTCastLookahead node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPostfixExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTCastExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPrimaryExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPrimaryPrefix node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTPrimarySuffix node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTLiteral node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTBooleanLiteral node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTNullLiteral node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTArguments node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTArgumentList node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTAllocationExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTArrayDimsAndInits node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTLabeledStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTBlock node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTBlockStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTLocalVariableDeclaration node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTEmptyStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTStatementExpression node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTSwitchStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTSwitchLabel node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTIfStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTWhileStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTDoStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTForStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTForInit node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTStatementExpressionList node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTForUpdate node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTBreakStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTContinueStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTReturnStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTThrowStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTSynchronizedStatement node, Object data) {
    return print(node, data);
  }

  @Override
  public Object visit(ASTTryStatement node, Object data) {
    return print(node, data);
  }
}
