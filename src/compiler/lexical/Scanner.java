/* The following code was generated by JFlex 1.4.1 on 3/2/21 3:24 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 3/2/21 3:24 from the specification file
 * <tt>/mnt/data/Uni/UNED_ETSII_Grado_En_Ingenieria_Informatica/3/1er Cuatri/Procesadores_Del_Lenguaje_1/Práctica/ArquitecturaPLI_2020_2021/ArquitecturaPLI-2020-2021/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\1\1\0\2\1\22\0\1\1\1\14\1\5\1\21\2\0"+
    "\1\13\1\0\1\42\1\43\1\7\1\10\1\50\2\0\1\6\1\4"+
    "\11\3\1\41\1\40\1\11\1\12\3\0\4\2\1\30\25\2\1\44"+
    "\1\0\1\45\3\0\1\16\1\27\1\15\1\35\1\24\1\36\2\2"+
    "\1\26\2\2\1\31\1\33\1\22\1\20\1\34\1\2\1\25\1\17"+
    "\1\23\1\37\1\32\4\2\1\46\1\0\1\47\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\2\4\2\1\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\3\3\1\1\6\3\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\3\23\1\0\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\3\3\1\32\1\0\10\3\1\33\1\34\4\3\1\0"+
    "\10\3\1\35\2\3\1\36\1\0\1\37\7\3\1\40"+
    "\1\3\1\0\2\3\1\41\5\3\1\0\1\3\1\42"+
    "\5\3\1\0\1\43\5\3\1\0\1\3\1\44\2\3"+
    "\1\45\1\3\1\0\2\3\1\46\1\3\1\47\1\50"+
    "\1\51\1\3\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\122\0\173\0\244\0\122\0\315"+
    "\0\366\0\122\0\u011f\0\122\0\u0148\0\u0171\0\122\0\u019a"+
    "\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2"+
    "\0\u030b\0\122\0\122\0\122\0\122\0\122\0\122\0\122"+
    "\0\122\0\122\0\122\0\u0334\0\u035d\0\315\0\122\0\122"+
    "\0\122\0\122\0\122\0\122\0\u0386\0\u03af\0\u03d8\0\u0401"+
    "\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\u0549"+
    "\0\u0572\0\122\0\122\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f"+
    "\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787"+
    "\0\173\0\u07b0\0\u07d9\0\173\0\u0802\0\173\0\u082b\0\u0854"+
    "\0\u087d\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\173\0\u094a\0\u0973"+
    "\0\u099c\0\u09c5\0\173\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92"+
    "\0\u0abb\0\u0ae4\0\173\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1"+
    "\0\u0bda\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9"+
    "\0\u0d22\0\173\0\u0d4b\0\u0d74\0\173\0\u0d9d\0\u0dc6\0\u0def"+
    "\0\u0e18\0\173\0\u0e41\0\122\0\173\0\173\0\u0e6a\0\173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\5\1\23\1\5\1\24\1\25\5\5\1\26\1\27"+
    "\1\30\1\31\2\5\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\6\43\1\44\1\45\41\43"+
    "\53\0\3\5\10\0\4\5\1\0\16\5\14\0\2\6"+
    "\45\0\4\46\1\47\7\0\4\46\1\0\16\46\20\0"+
    "\1\50\51\0\1\51\1\0\1\52\50\0\1\53\51\0"+
    "\1\54\37\0\3\5\10\0\1\5\1\55\1\5\1\56"+
    "\1\0\16\5\13\0\3\5\10\0\4\5\1\0\7\5"+
    "\1\57\6\5\13\0\3\5\10\0\4\5\1\0\4\5"+
    "\1\60\11\5\26\0\1\61\35\0\3\5\10\0\4\5"+
    "\1\0\4\5\1\62\11\5\13\0\3\5\10\0\2\5"+
    "\1\63\1\5\1\0\1\64\15\5\13\0\3\5\10\0"+
    "\1\5\1\65\2\5\1\0\16\5\13\0\3\5\10\0"+
    "\4\5\1\0\4\5\1\66\11\5\13\0\3\5\10\0"+
    "\3\5\1\67\1\0\3\5\1\70\12\5\13\0\3\5"+
    "\10\0\4\5\1\0\2\5\1\71\13\5\20\0\1\72"+
    "\47\0\1\73\44\0\3\5\10\0\2\5\1\74\1\5"+
    "\1\0\16\5\13\0\3\5\10\0\4\5\1\0\3\5"+
    "\1\75\12\5\13\0\3\5\10\0\4\5\1\0\1\5"+
    "\1\76\14\5\13\0\3\5\10\0\4\5\1\0\1\77"+
    "\15\5\31\0\1\100\32\0\3\5\10\0\4\5\1\0"+
    "\12\5\1\101\3\5\13\0\3\5\10\0\1\102\3\5"+
    "\1\0\16\5\13\0\3\5\10\0\4\5\1\0\1\5"+
    "\1\103\14\5\13\0\3\5\10\0\1\104\3\5\1\0"+
    "\16\5\13\0\3\5\10\0\4\5\1\0\2\5\1\105"+
    "\13\5\13\0\3\5\10\0\4\5\1\0\3\5\1\106"+
    "\12\5\13\0\3\5\10\0\4\5\1\0\4\5\1\107"+
    "\11\5\13\0\3\5\10\0\4\5\1\0\10\5\1\110"+
    "\5\5\13\0\3\5\10\0\3\5\1\111\1\0\16\5"+
    "\13\0\3\5\10\0\4\5\1\0\1\5\1\112\14\5"+
    "\13\0\3\5\10\0\4\5\1\0\2\5\1\113\13\5"+
    "\13\0\3\5\10\0\3\5\1\114\1\0\16\5\33\0"+
    "\1\115\30\0\3\5\10\0\3\5\1\116\1\0\16\5"+
    "\13\0\3\5\10\0\4\5\1\0\3\5\1\117\12\5"+
    "\13\0\3\5\10\0\4\5\1\0\2\5\1\120\13\5"+
    "\13\0\3\5\10\0\4\5\1\0\4\5\1\121\11\5"+
    "\13\0\3\5\10\0\4\5\1\0\1\122\15\5\13\0"+
    "\3\5\10\0\4\5\1\0\13\5\1\123\2\5\13\0"+
    "\3\5\10\0\4\5\1\0\1\124\15\5\13\0\3\5"+
    "\10\0\4\5\1\0\15\5\1\125\13\0\3\5\10\0"+
    "\4\5\1\0\2\5\1\126\13\5\13\0\3\5\10\0"+
    "\4\5\1\0\3\5\1\127\12\5\30\0\1\130\33\0"+
    "\3\5\10\0\4\5\1\0\4\5\1\131\11\5\13\0"+
    "\3\5\10\0\4\5\1\0\3\5\1\132\12\5\13\0"+
    "\3\5\10\0\3\5\1\133\1\0\16\5\13\0\3\5"+
    "\10\0\4\5\1\0\1\5\1\134\14\5\13\0\3\5"+
    "\10\0\4\5\1\0\2\5\1\135\13\5\13\0\3\5"+
    "\10\0\1\136\3\5\1\0\16\5\13\0\3\5\10\0"+
    "\4\5\1\0\2\5\1\137\13\5\13\0\3\5\10\0"+
    "\4\5\1\0\1\140\15\5\34\0\1\141\27\0\3\5"+
    "\10\0\4\5\1\0\5\5\1\142\10\5\13\0\3\5"+
    "\10\0\3\5\1\143\1\0\16\5\13\0\3\5\10\0"+
    "\4\5\1\0\3\5\1\144\12\5\13\0\3\5\10\0"+
    "\4\5\1\0\14\5\1\145\1\5\13\0\3\5\10\0"+
    "\4\5\1\0\4\5\1\146\11\5\13\0\3\5\10\0"+
    "\4\5\1\0\7\5\1\147\6\5\13\0\3\5\10\0"+
    "\1\5\1\150\2\5\1\0\16\5\27\0\1\151\34\0"+
    "\3\5\10\0\4\5\1\0\2\5\1\152\13\5\13\0"+
    "\3\5\10\0\1\5\1\153\2\5\1\0\16\5\13\0"+
    "\3\5\10\0\4\5\1\0\2\5\1\154\13\5\13\0"+
    "\3\5\10\0\4\5\1\0\12\5\1\155\3\5\13\0"+
    "\3\5\10\0\4\5\1\0\10\5\1\156\5\5\13\0"+
    "\3\5\10\0\4\5\1\0\1\5\1\157\14\5\33\0"+
    "\1\160\30\0\3\5\10\0\4\5\1\0\6\5\1\161"+
    "\7\5\13\0\3\5\10\0\2\5\1\162\1\5\1\0"+
    "\16\5\13\0\3\5\10\0\1\163\3\5\1\0\16\5"+
    "\13\0\3\5\10\0\1\5\1\164\2\5\1\0\16\5"+
    "\13\0\3\5\10\0\4\5\1\0\2\5\1\165\13\5"+
    "\13\0\3\5\10\0\4\5\1\0\4\5\1\166\11\5"+
    "\34\0\1\167\27\0\3\5\10\0\4\5\1\0\1\170"+
    "\15\5\13\0\3\5\10\0\4\5\1\0\1\5\1\171"+
    "\14\5\13\0\3\5\10\0\4\5\1\0\7\5\1\172"+
    "\6\5\13\0\3\5\10\0\4\5\1\0\10\5\1\173"+
    "\5\5\35\0\1\174\26\0\3\5\10\0\4\5\1\0"+
    "\1\5\1\175\14\5\13\0\3\5\10\0\3\5\1\176"+
    "\1\0\16\5\13\0\3\5\10\0\1\5\1\177\2\5"+
    "\1\0\16\5\13\0\3\5\10\0\2\5\1\200\1\5"+
    "\1\0\16\5\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3731];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\2\1\1\11\2\1\1\11\1\1\1\11"+
    "\2\1\1\11\12\1\12\11\2\1\1\0\6\11\4\1"+
    "\1\0\10\1\2\11\4\1\1\0\14\1\1\0\12\1"+
    "\1\0\10\1\1\0\7\1\1\0\6\1\1\0\6\1"+
    "\1\0\4\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

  	LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  	private int commentCount = 0;
  
  	/**
  	 *	Crea un token para el identificador id 
  	 * 
  	 *@param id numero identificiador del simbolo
  	 */
	private Token createToken(int id){  		
  		Token token = new Token (id);
  		token.setLine(yyline + 1);
  		token.setColumn(yycolumn + 1);
  		token.setLexema(yytext());
  		return token;
  	}
  	
  	/**
  	 * Genera un error con el mensaje msg
  	 * 
  	 *@param msg mensaje del error
  	 */
  	private LexicalError generateError(String msg){
  		LexicalError error = new LexicalError(msg);
  		error.setLine(yyline + 1);
  		error.setColumn(yycolumn + 1);
  		error.setLexema(yytext());
  		return error;
  	}
  	


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 116) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 32: 
          { return createToken(sym.BREAK);
          }
        case 43: break;
        case 31: 
          { return createToken(sym.TYPE);
          }
        case 44: break;
        case 33: 
          { return createToken(sym.VOID);
          }
        case 45: break;
        case 29: 
          { return createToken(sym.CASE);
          }
        case 46: break;
        case 38: 
          { return createToken(sym.MAIN);
          }
        case 47: break;
        case 42: 
          { return createToken(sym.SWITCH);
          }
        case 48: break;
        case 30: 
          { return createToken(sym.ELSE);
          }
        case 49: break;
        case 16: 
          { return createToken(sym.LLAVEOP);
          }
        case 50: break;
        case 11: 
          { return createToken(sym.TWOPOINTS);
          }
        case 51: break;
        case 34: 
          { return createToken(sym.INT);
          }
        case 52: break;
        case 9: 
          { return createToken(sym.NOT);
          }
        case 53: break;
        case 25: 
          { return createToken(sym.AND);
          }
        case 54: break;
        case 35: 
          { return createToken(sym.PRINT);
          }
        case 55: break;
        case 23: 
          { return createToken(sym.ASIGSUM);
          }
        case 56: break;
        case 19: 
          { /* No hacer nada */
          }
        case 57: break;
        case 41: 
          { return createToken(sym.DEFAULT);
          }
        case 58: break;
        case 1: 
          { lexicalErrorManager.lexicalError (generateError("La expresión no coincide con ningún patrón"));
          }
        case 59: break;
        case 13: 
          { return createToken(sym.PARENCL);
          }
        case 60: break;
        case 39: 
          { return createToken(sym.CONST);
          }
        case 61: break;
        case 18: 
          { return createToken(sym.COMMA);
          }
        case 62: break;
        case 4: 
          { return createToken(sym.NUM);
          }
        case 63: break;
        case 15: 
          { return createToken(sym.CORCHCL);
          }
        case 64: break;
        case 22: 
          { return createToken(sym.AUTOINC);
          }
        case 65: break;
        case 20: 
          { // Elimina las comillas del lexema
	 	Token token = new Token (sym.STRING);
	 	token.setLine(yyline + 1);
	 	token.setColumn(yycolumn + 1);
	 	token.setLexema(yytext().substring(1,yytext().length()-1));
	 	return token;
          }
        case 66: break;
        case 5: 
          { return createToken(sym.PROD);
          }
        case 67: break;
        case 21: 
          { commentCount++; yybegin(COMMENT);
          }
        case 68: break;
        case 28: 
          { commentCount--;
    	 	if (commentCount == 0)  yybegin(YYINITIAL);
    		else if (commentCount < 0) lexicalErrorManager.lexicalError(generateError("Comentarios mal balanceados: un */ no cierra nada"));
          }
        case 69: break;
        case 17: 
          { return createToken(sym.LLAVECL);
          }
        case 70: break;
        case 26: 
          { return createToken(sym.IF);
          }
        case 71: break;
        case 8: 
          { return createToken(sym.ASIG);
          }
        case 72: break;
        case 12: 
          { return createToken(sym.PARENOP);
          }
        case 73: break;
        case 24: 
          { return createToken(sym.EQ);
          }
        case 74: break;
        case 27: 
          { commentCount++;
          }
        case 75: break;
        case 37: 
          { return createToken(sym.RETURN);
          }
        case 76: break;
        case 10: 
          { return createToken(sym.SEMICOL);
          }
        case 77: break;
        case 6: 
          { return createToken(sym.PLUS);
          }
        case 78: break;
        case 3: 
          { return createToken(sym.ID);
          }
        case 79: break;
        case 14: 
          { return createToken(sym.CORCHOP);
          }
        case 80: break;
        case 7: 
          { return createToken(sym.LESS);
          }
        case 81: break;
        case 40: 
          { return createToken(sym.PRINTINT);
          }
        case 82: break;
        case 36: 
          { return createToken(sym.WHILE);
          }
        case 83: break;
        case 2: 
          { 
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case COMMENT: {
              if (commentCount != 0) lexicalErrorManager.lexicalError(generateError("Comentarios mal balanceados: seguramente un /* no está cerrado"));
            }
            case 129: break;
            default:
              { return new java_cup.runtime.Symbol(sym.EOF); }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
