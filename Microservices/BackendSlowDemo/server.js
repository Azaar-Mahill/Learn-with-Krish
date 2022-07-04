const express = require('express');
const app = express();

app.post('/save',async(req, res) => {
    
    await new Promise((resolve) => setTimeout(resolve,60000));
    res.send('job done');
});

app.listen(8191);