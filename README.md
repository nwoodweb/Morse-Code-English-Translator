# Morse-Code-English-Translator 
A java program the converts english to morse code. 

This program uses a simple binary tree in order to translate English into Morse Code, and vice versa.

                                        A?
                                       / \
                            result +="A"  B?
                                         /  \
                              result +="B"   C? 
                        
This is looped until the complete translation of the input string.

Special parameters are given towards punctuation, to translate to whitespace to separate words from sentences, which can lead to confusion when using a real morse code key to relay messages. 

Untranslatable characters, such as "$" or "(" will return an error message. If currency needs to specified, please input as its name, ie USD, BTC, CNY, or EUR. 
