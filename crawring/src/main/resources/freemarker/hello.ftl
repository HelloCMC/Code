<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

</head>
<body>

  <#list wa as user>
    <div class="accordion accordion-flush" id="accordionExample">
        <div class="accordion-item">
          <h2 class="accordion-header">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#${user.hashCode()}" aria-expanded="true" aria-controls="${user.hashCode()}}">
              ${user.getCity()} | ${user.getTmEf()}
            </button>
          </h2>
          <div id="${user.hashCode()}" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
            <div class="accordion-body">
              날씨 : ${user.getWf()}<br>
              최저 : ${user.getTmn()}<br>
              최고 : ${user.getTmx()}<br>
            </div>
          </div>
        </div>
        
    </div>
    </#list>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>