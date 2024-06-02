// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/LexerParserRobot2410.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class LexerParserRobot2410 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=5;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(LexerParserRobot2410.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=6;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=7;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"elements",$line);
    }
    return $result;
  }
  public static Object get1(java.lang.Iterable $v11) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v12=GCollections.unmodifiableCollection($v11).iterator();
      Object r=$v12.next();
      Object i=$v12.next();
      $result=r;
      if (true) break $try;
      $line=8;
      $rethrow(new RuntimeException("The function \"get1(\u27E8r,i\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"get1",$line);
    }
    return $result;
  }
  public static Object get2(java.lang.Iterable $v13) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v14=GCollections.unmodifiableCollection($v13).iterator();
      Object r=$v14.next();
      Object i=$v14.next();
      $result=i;
      if (true) break $try;
      $line=9;
      $rethrow(new RuntimeException("The function \"get2(\u27E8r,i\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"get2",$line);
    }
    return $result;
  }
  public static GDeterministicTransducer lexer=null;
  static {
    int $line=0;
    $line=12;
    $try:try {
      lexer=$defaultValue(GDeterministicTransducer.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,null,$line);
    }
  }
  public static GPushdownAutomaton parser=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      parser=$defaultValue(GPushdownAutomaton.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,null,$line);
    }
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=16;
      Object currentString=$fix("");
      $line=18;
      lexer=$cast(GDeterministicTransducer.class,$fix(Lexer202410.createLexer()));
      $line=20;
      parser=$cast(GPushdownAutomaton.class,$fix(ParserRobot202410.createParser(((gold.structures.automaton.GDeterministicTransducer)lexer).getOutputAlphabet())));
      $line=25;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,parser));
      $line=29;
      LexerParserRobot2410.testLexerParser($cast(gold.structures.automaton.ITransducer.class,lexer),$cast(gold.structures.automaton.IPushdownAutomaton.class,parser));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"main",$line);
    }
  }
  public static Object testLexer(ITransducer M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=34;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=35;
      String string=null;
      string=$defaultValue(String.class);
      $line=36;
      String input=null;
      input=$defaultValue(String.class);
      $line=39;
      Object inputA=$fix(LexerParserRobot2410.elements(((gold.structures.automaton.ITransducer)M).getInputAlphabet()));
      $line=40;
      input=$cast(String.class,$fix(""));
      $line=41;
      System.out.println($message(new Object[]{"----------------------------"}));
      $line=42;
      System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
      $line=43;
      System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
      $line=44;
      string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      $line=45;
      while (true) {
        if (!(!$opEqualY(string,"EXIT"))) break;
        $line=46;
        string=$cast(String.class,$fix($opAdditY(string," \n ")));
        $line=47;
        input=$cast(String.class,$fix(""));
        $line=48;
        while (true) {
          if (!(!$opEqualY(((java.lang.String)string).charAt($int(0)),'$'))) break;
          $line=49;
          input=$cast(String.class,$fix($opAdditY(input,string)));
          $line=50;
          string=$cast(String.class,$fix($opAdditY(((java.util.Scanner)sc).nextLine()," \n  ")));
        }
        $line=52;
        if ($opSbsetY(LexerParserRobot2410.chars(input),inputA)) {
          $line=53;
          Object currentString=$fix("");
          $line=54;
          Object images=$fix($invokeConstructor(GArrayList.class,new Object[]{}));
          $line=56;
          Object result=$fix(Lexer202410.runLexer(M,input));
          $line=59;
          Object ok=$fix(LexerParserRobot2410.get1($cast(java.lang.Iterable.class,result)));
          $line=60;
          images=$fix(LexerParserRobot2410.get2($cast(java.lang.Iterable.class,result)));
          $line=61;
          Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
          $line=63;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("The input was ",(($bool(ok))?(""):("not ")))," accepted by the lexer.")}));
          $line=64;
          if ($bool(ok)) {
            $line=65;
            System.out.println($message(new Object[]{$opAdditY("Token Stream:  ",tokenStream)}));
            $line=66;
            System.out.println($message(new Object[]{$opAdditY("Strings: ",images)}));
          }
          else {
            $line=67;
            System.out.println($message(new Object[]{$opAdditY("Partial token Stream ",tokenStream)}));
          }
        }
        else {
          $line=69;
          System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot2410.chars(input),inputA))}));
        }
        $line=71;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=73;
        System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
        $line=74;
        System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
        $line=75;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      }
      $line=78;
      System.out.println($message(new Object[]{"Good bye"}));
      $line=79;
      System.out.println($message(new Object[]{""}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"testLexer",$line);
    }
    return $result;
  }
  public static Object testLexerParser(ITransducer M, IPushdownAutomaton P) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=90;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=91;
      String string=null;
      string=$defaultValue(String.class);
      $line=92;
      String input=null;
      input=$defaultValue(String.class);
      $line=95;
      Object inputA=$fix(LexerParserRobot2410.elements(((gold.structures.automaton.ITransducer)M).getInputAlphabet()));
      $line=96;
      Object inputP=$fix(LexerParserRobot2410.elements(((gold.structures.automaton.IPushdownAutomaton)P).getInputAlphabet()));
      $line=99;
      input=$cast(String.class,$fix(""));
      $line=102;
      System.out.println($message(new Object[]{"----------------------------"}));
      $line=103;
      System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
      $line=104;
      System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
      $line=105;
      string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      $line=110;
      while (true) {
        if (!(!$opEqualY(string,"EXIT"))) break;
        $line=112;
        string=$cast(String.class,$fix($opAdditY(string,"  \n ")));
        $line=113;
        input=$cast(String.class,$fix(""));
        $line=114;
        while (true) {
          if (!(!$opEqualY(((java.lang.String)string).charAt($int(0)),'$'))) break;
          $line=115;
          input=$cast(String.class,$fix($opAdditY(input,string)));
          $line=116;
          string=$cast(String.class,$fix($opAdditY(((java.util.Scanner)sc).nextLine()," \n ")));
        }
        $line=119;
        Object option=$fix("");
        $line=120;
        while (true) {
          if (!(!$opMembrY(option,GCollections.asSet("1","2","3")))) break;
          $line=121;
          System.out.println($message(new Object[]{"What do you want to do?"}));
          $line=122;
          System.out.println($message(new Object[]{"1. Lexer only?"}));
          $line=123;
          System.out.println($message(new Object[]{"2. Lexer and parser?"}));
          $line=124;
          System.out.println($message(new Object[]{"3. Parser?"}));
          $line=125;
          option=$fix(((java.util.Scanner)sc).nextLine());
        }
        $line=127;
        Object stringOut=$fix("");
        $line=128;
        if ($opMembrY(option,GCollections.asSet("1","2"))) {
          $line=129;
          if ($opSbsetY(LexerParserRobot2410.chars(input),inputA)) {
            $line=130;
            Object currentString=$fix("");
            $line=131;
            Object images=$fix($invokeConstructor(GArrayList.class,new Object[]{}));
            $line=133;
            Object result=$fix(Lexer202410.runLexer(M,input));
            $line=136;
            Object ok=$fix(LexerParserRobot2410.get1($cast(java.lang.Iterable.class,result)));
            $line=137;
            images=$fix(LexerParserRobot2410.get2($cast(java.lang.Iterable.class,result)));
            $line=138;
            Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
            $line=143;
            System.out.println($message(new Object[]{$opAdditY($opAdditY("The input was ",(($bool(ok))?(""):("not ")))," accepted by the lexer.")}));
            $line=144;
            if ($bool(ok)) {
              $line=145;
              System.out.println($message(new Object[]{$opAdditY("Token Stream:  ",tokenStream)}));
              $line=146;
              System.out.println($message(new Object[]{$opAdditY("Strings: ",images)}));
              $line=147;
              if ($opEqualY(option,"2")) {
                $line=148;
                ok=$fix(((gold.structures.automaton.IPushdownAutomaton)P).acceptsString($cast(java.lang.String.class,tokenStream)));
                $line=149;
                System.out.println($message(new Object[]{$opAdditY("Parser result: ",(($bool(ok))?("accepted "):("rejected ")))}));
              }
            }
            else {
              $line=151;
              System.out.println($message(new Object[]{$opAdditY("Partial token Stream: ",tokenStream)}));
            }
          }
          else {
            $line=153;
            System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot2410.chars(input),inputA))}));
          }
        }
        else {
          $line=156;
          if ($opSbsetY(LexerParserRobot2410.chars(input),inputP)) {
            $line=157;
            Object ok=$fix(((gold.structures.automaton.IPushdownAutomaton)P).acceptsString($cast(java.lang.String.class,input)));
            $line=158;
            System.out.println($message(new Object[]{$opAdditY("Parser result: ",(($bool(ok))?("accepted "):("rejected ")))}));
          }
          else {
            $line=160;
            System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot2410.chars(input),inputP))}));
          }
        }
        $line=163;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=165;
        System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
        $line=166;
        System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
        $line=167;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      }
      $line=170;
      System.out.println($message(new Object[]{"Good bye"}));
      $line=171;
      System.out.println($message(new Object[]{""}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot2410.class,"testLexerParser",$line);
    }
    return $result;
  }
}
