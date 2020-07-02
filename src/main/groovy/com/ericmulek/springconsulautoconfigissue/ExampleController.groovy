package com.ericmulek.springconsulautoconfigissue

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {

    @Autowired
    ExampleConfig exampleConfig

    @GetMapping('test')
    String example1() {
        exampleConfig.prop
    }
}
