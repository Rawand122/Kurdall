package com.rawand.kurdall.kurdall.web;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class WebController {
    // standard constructors

    private final Translate translate;


    public WebController() {
        translate = TranslateOptions.newBuilder().setApiKey(System.getenv("apiKey")).build().getService();
    }


    @GetMapping("/translate")
    public String translation(){
        return "translate";
    }
    @GetMapping("/resources")
    public String about(){

        return "resources";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    ///"/{sourceLang}/{targetLang}/{text}"
    @PostMapping("/translate")
    public String translateText(
            @RequestParam String userinput,@RequestParam String translationFrom, @RequestParam String translationTo,
            @RequestParam String translation
    ,Model model
    ) {
        try {
            String textToTranslate = (!userinput.isEmpty()) ? userinput : translation;
            Translation translatedText = translate.translate(textToTranslate,
                    Translate.TranslateOption.sourceLanguage(translationFrom),
                    Translate.TranslateOption.targetLanguage(translationTo));

            if("en".equals(translationFrom)){

                model.addAttribute("textArea1",textToTranslate);
                model.addAttribute("textArea2",translatedText.getTranslatedText());
            } else {
                model.addAttribute("textArea1",translatedText.getTranslatedText());
                model.addAttribute("textArea2",textToTranslate);
            }

            return "translate";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("text",e.getCause());

            return "translate";
        }
    }


}
