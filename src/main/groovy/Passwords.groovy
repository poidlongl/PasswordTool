

/**
 * Created by leo on 28.11.15.
 */
class Passwords {

    static mainmenu = [
            '1': [ 'text': 'Encrypt RCI Password', 'function': { encryptRci() }] ,
            '2': [ 'text': 'DecrypT RCI Password', 'function': { decryptRci() }] ,
            '3': [ 'text': 'Generate Masterkey', 'function': { genMasterkey() }] ,
            '4': [ 'text': 'Activate Masterkey', 'function': { loadMasterkey() }] ,
            '5': [ 'text': 'Encrypt with current Masterkey', 'function': { encryptMaster() }] ,
            '6': [ 'text': 'Decrypt with current Masterkey', 'function': { decryptMaster() }] ,
            'X': [ 'text': 'Exit', 'function': { println "bye" }]
    ]

    static genMasterkey()  {
        println "Called!"
    }

    public static void main(String[] args) {

        new Passwords().showmenue(mainmenu)
    }

    void showmenue(Map menu) {
        def choice;
        println ""

        while(true) {
            menu.each{ key, val ->
                println( key.padRight(3) + ' - ' + val.text)
            }

            choice = System.in.newReader().readLine().toLowerCase()
            if ( menu[choice]) {
                println "Choice!"
                menu[choice].function()
            }
            if ( choice == 'x' ) return
        }
    }
}
